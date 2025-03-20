# Animal API 🐾

A Spring Boot RESTful API for managing animals.

## 📌 Features
- Create, Read, Update, and Delete (CRUD) animals.
- Search animals by breed.
- Search animals by name.

## 🚀 API Endpoints
| Method | Endpoint | Description |
|--------|---------|------------|
| GET | `/animals` | Get all animals |
| GET | `/animals/{id}` | Get an animal by ID |
| POST | `/animals` | Add a new animal |
| PUT | `/animals/{id}` | Update an animal |
| DELETE | `/animals/{id}` | Delete an animal |
| GET | `/animals/breed/{breed}` | Get animals by breed |
| GET | `/animals/search?name=value` | Search animals by name |
