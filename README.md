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

<img width="1178" height="554" alt="Screenshot 2026-04-17 at 23 19 06" src="https://github.com/user-attachments/assets/ecdb5837-bcdc-4446-8c45-c186d310b957" />


### Admin Login

<img width="1181" height="511" alt="Screenshot 2026-04-17 at 23 21 29" src="https://github.com/user-attachments/assets/a578f587-e60f-4f2c-b31f-4e3ff821c0dc" />


## Register User

<img width="1179" height="501" alt="Screenshot 2026-04-17 at 23 19 51" src="https://github.com/user-attachments/assets/4484f128-1336-416b-bed9-30e9a061aa7e" />


### User Login

<img width="1182" height="511" alt="Screenshot 2026-04-17 at 23 22 02" src="https://github.com/user-attachments/assets/bb48e772-9e41-4f49-967b-29d5c0650156" />


## Book Creation

<img width="1208" height="792" alt="Screenshot 2026-04-17 at 23 28 53" src="https://github.com/user-attachments/assets/da69e305-3fb4-45c4-86c7-5969172fd660" />


## Book Deletion as a User with user token

<img width="1205" height="502" alt="Screenshot 2026-04-17 at 23 30 47" src="https://github.com/user-attachments/assets/da546490-fe72-4ec7-a7eb-1244d5447127" />


## Book Deletion as an Admin with admin token

<img width="1202" height="500" alt="Screenshot 2026-04-17 at 23 33 00" src="https://github.com/user-attachments/assets/904f7fe0-d4b3-40aa-b028-1b8a72b8a397" />

## Deleting a book that does not exist as an Admin

<img width="1179" height="477" alt="Screenshot 2026-04-20 at 17 07 26" src="https://github.com/user-attachments/assets/26e634d8-6f9f-4cd1-8f68-7363b107ee29" />
