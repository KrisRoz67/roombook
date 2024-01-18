# Customer API Endpoints:

## 1. Register a Customer:
- **Method:** POST
- **Endpoint:** '/customers/register/'
- **Request:**
    - Full name
    - Email
    - Phone number
- **Response:**
    - HTTP status code

## 2. Get Available Rooms for Given Date:
- **Method:** GET
- **Endpoint:** '/rooms/available'
- **Request:**
    - Date
- **Response:**
    - HTTP status code
    - Data: List of available room objects
      - id
      - name
      - maximum number of guests
      - bed type

## 3. Make Room Reservation:
- **Method:** POST
- **Endpoint:** '/rooms/reserve'
- **Request:**
    - Customer ID
    - Room ID
    - Reservation Date
- **Response:**
    - HTTP status code

## 4. Cancel Room Reservation:
- **Method:** POST
- **Endpoint:** '/rooms/cancel'
- **Request:**
    - Customer ID
    - Room ID
    - Reservation ID
- **Response:**
    - HTTP status code

## 5. Change Room Reservation Date:
- **Method:** PUT
- **Endpoint:** '/rooms/change-reservation-date'
- **Request:**
    - Customer ID
    - Reservation ID
    - Room ID
    - New Reservation Date
- **Response:**
    - HTTP status code

# Administrator API Endpoints:

## 1. Get All Rooms Reservations:
- **Method:** GET
- **Endpoint:** '/admin/reservations'
- **Response:**
    - HTTP status code
    - Data: List of all rooms reservation objects
      - id
      - date of reservation
      - status
      - breakfast
      - room id
      - room name
      - bed type
      - client id
      - client full name
      - client phone
      - client email



## 2. Blocklist a Customer:
- **Method:** POST
- **Endpoint:** '/admin/blocklist'
- **Request:**
    - Customer ID
- **Response:**
    - HTTP status code

## 3. Remove Customer from Blocklist:
- **Method:** POST
- **Endpoint:** '/admin/unblock'
- **Request:**
    - Customer ID
- **Response:**
    - HTTP status code

## 4. List Customers in Blocklist:
- **Method:** GET
- **Endpoint:** '/admin/blocklist'
- **Response:**
    - HTTP status code
    - Data: List of blocked customer IDs
      - id
      - full name
      - phone
      - email

## 5. Change Reservation Date (Administrator):
- **Method:** PUT
- **Endpoint:** '/admin/change-reservation-date'
- **Request:**
    - Reservation ID
    - Room ID
    - New Reservation Date
- **Response:**
    - HTTP status code

## 6. Cancel Room Reservation (Administrator):
- **Method:** POST
- **Endpoint:** '/admin/cancel-reservation'
- **Request:**
    - Reservation ID
- **Response:**
    - HTTP status code

## 7. Confirm Room Reservation (Administrator):
- **Method:** POST
- **Endpoint:** '/admin/confirm-reservation'
- **Request:**
    - Reservation ID
- **Response:**
    - HTTP status code

## 8. Delete Room Reservation (Administrator):
- **Method:** DELETE
- **Endpoint:** '/admin/delete-reservation'
- **Request:**
    - Reservation ID
- **Response:**
    - HTTP status code
