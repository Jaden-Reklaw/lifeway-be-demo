# Lifeway BE Demo Application

## Setup

1. Clone project from Github and start up in IntelliJ
2. Run the DemoApplication or Main method. Note it will fail the first time.
3. Click on DemoApplication -> Edit Configuration.
4. Add the following environmental variables for database connection
    - DB_URL
    - DB_USERNAME
    - DB_PASSWORD
5. Open up Database Application for Postgres. Run all sql commands in data.sql located in resources folder of this project.
6. Import Lifeway-Demo.postman_collection.json to Postman.
7. Start the project up again. If successful it should be running on port 8080.
8. Use the REST API info down below to send request using postman.

## Rest API Info
### Get All Users
#### Request
- Method: GET
- Endpoint: `/users`

#### Response
- Status Code: 200 OK
- Content-Type: application/json

#### Example Response Body
```json
[
   {
      "id": 1,
      "firstName": "John",
      "lastName": "Smith",
      "username": "johnsmith123",
      "email": "john.smith@example.com",
      "mobileNumber": "1234567890"
   },
   {
      "id": 2,
      "firstName": "Alice",
      "lastName": "Johnson",
      "username": "alice.johnson",
      "email": "alice.johnson@example.com",
      "mobileNumber": "9876543210"
   },
]
```

### Get User By Id
#### Request
- Method: GET
- Endpoint: `/users/{id}` (Replace {id} with the actual user ID)

#### Response
- Status Code: 200 OK
- Content-Type: application/json

#### Example Response Body
```json
{
   "id": 1,
   "firstName": "John",
   "lastName": "Smith",
   "username": "johnsmith123",
   "email": "john.smith@example.com",
   "mobileNumber": "1234567890"
}
```

### Create New User
#### Request
- Method: POST
- Endpoint: `/users`
- Content-Type: application/json

#### Example Request Body
```json
{
   "firstName": "Bob",
   "lastName": "Belcher",
   "username": "burgerbob1",
   "email": "burgerbob@aol.com",
   "mobileNumber": "7777777777"
}
```

#### Response
- Status Code: 201 Created
- Location Header: /users/{id} (The newly created user's ID will be included in the URL)

### Update User By Id
#### Request
- Method: PUT
- Endpoint: `/users/{id}` (Replace {id} with the ID of the user to be updated)
- Content-Type: application/json

#### Example Request Body
```json
{
   "firstName": "James",
   "lastName": "Bond",
   "mobileNumber": "0000000007"
}
```

#### Response
- Status Code: 200 OK 
- Content-Type: application/json

#### Example Response Body
```json
{
   "id": 34,
   "firstName": "James",
   "lastName": "Bond",
   "username": "burgerbob1",
   "email": "burgerbob@aol.com",
   "mobileNumber": "0000000007"
}
```

### Delete User By Id
#### Request
- Method: DELETE
- Endpoint: `/users/{id}` (Replace {id} with the ID of the user to be deleted)

#### Response
- Status Code: 204 No Content