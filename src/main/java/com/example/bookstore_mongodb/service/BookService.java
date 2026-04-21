package com.example.bookstore_mongodb.service;

import com.example.bookstore_mongodb.entity.Book;
import com.example.bookstore_mongodb.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private RedisTemplate redisTemplate;
    public Book createBook(Book book)
    {
        book.setCreatedAt(new Date());

        return bookRepository.save(book);
    }

    /// get all books
    public List<Book> getAllBooks()
    {
        return bookRepository.findAll();
    }

    public boolean deleteBook(String id)
    {
        if (!bookRepository.existsById(id))
        {
            return false;
        }
        bookRepository.deleteById(id);
        return true;
    }

    public Book getBookByIsbnManual(String isbn)
    {
        String cacheKey = "book::" +isbn;

        Object cached = redisTemplate.opsForValue().get(cacheKey);

        if(cached != null)
        {
            System.out.println("[MANUEL CACHE HIT] RETURN" +cacheKey+ " from REDIS");
        }

        System.out.println("MANUAL CACHE MISS fetching" + isbn + "from db");

        Book book = bookRepository.findByIsbn(isbn)
                .orElseThrow(() -> new RuntimeException("Book not found"));

        redisTemplate.opsForValue().set(cacheKey, book);

        return book;
    }

    @Cacheable(value = "books", key = "#isbn")
    public Book getBookByIsbn(String isbn)
    {
        System.out.println("MANUAL CACHE MISS fetching" + isbn + "from db");

        return bookRepository.findByIsbn(isbn)
                .orElseThrow(() -> new RuntimeException("Book not found"));
    }
}
