package com.example.bookstore_mongodb.repository;

import com.example.bookstore_mongodb.entity.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public interface BookRepository extends MongoRepository<Book, String> {

    /// find by title
    Optional<Book> findByTitle(String s);

    /// find by stock
    List<Book> findByInStock(Boolean b);

    /// find price less than input
    List<Book> findByPriceLessThanEqual(BigDecimal price);

    List<Book> findByAuthorName(String authorName);

    @Query("{'price': {$gt : ?0, $lt : ?1}}")
    List<Book> getBookByPriceRange(BigDecimal lower, BigDecimal upper);

    /// fetching by ISBN, return a book
    Optional<Book> findByIsbn(String s);
}
