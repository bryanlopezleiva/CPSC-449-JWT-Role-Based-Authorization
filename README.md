# CPSC 449 Assignment 2 -- JWT Role-Based Authorization

## Bryan Lopez L.

## API Endpoints

| Method | URL                  | Description                                                                       |
|--------|----------------------|-----------------------------------------------------------------------------------|
| POST   | `/api/auth/register` | Create a new user with roles USER and ADMIN                                       |
| POST   | `/api/auth/register` | Create a new user with USER role                                                  |
| POST   | `/api/books`         | Create a new book                                                                 |
| POST   | `/api/auth/login`    | Login in with Admin or User credentials to receive token                          |
| DELETE | `/api/books/{id}`    | Delete a book with USER token (using Bearer) returns 403 Forbidden response       |
| DELETE | `/api/books/{id}`    | Delete a book with ADMIN token (using Bearer) returns 200 OK with success message |

## Register an Admin (with roles USER & ADMIN)


### Admin Login


## Register User


### User Login


## Book Creation


## Book Deletion as a User with user token


## Book Deletion as an Admin with admin token


