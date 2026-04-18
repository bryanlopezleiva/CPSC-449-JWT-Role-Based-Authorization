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

![Screenshot 2026-04-17 at 23.19.06.png](..%2FDesktop%2FScreenshot%202026-04-17%20at%2023.19.06.png)

### Admin Login

![Screenshot 2026-04-17 at 23.21.29.png](..%2FDesktop%2FScreenshot%202026-04-17%20at%2023.21.29.png)

## Register User

![Screenshot 2026-04-17 at 23.19.51.png](..%2FDesktop%2FScreenshot%202026-04-17%20at%2023.19.51.png)

### User Login

![Screenshot 2026-04-17 at 23.22.02.png](..%2FDesktop%2FScreenshot%202026-04-17%20at%2023.22.02.png)

## Book Creation

![Screenshot 2026-04-17 at 23.28.53.png](..%2FDesktop%2FScreenshot%202026-04-17%20at%2023.28.53.png)

## Book Deletion as a User with user token

![Screenshot 2026-04-17 at 23.30.47.png](..%2FDesktop%2FScreenshot%202026-04-17%20at%2023.30.47.png)

## Book Deletion as an Admin with admin token

![Screenshot 2026-04-17 at 23.33.00.png](..%2FDesktop%2FScreenshot%202026-04-17%20at%2023.33.00.png)

