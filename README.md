# Airline-Booking-System

The Airline Management System is a web application developed using Spring Boot, Postman, and MySQL. It enables customers to register, search for flights, view available seats, make selections, and book flights. It also provides administrative functionalities for managing routes, flights, and seating configurations.

## Prerequisites

- JDK 11 or higher
- Maven
- MySQL Database
- Postman (for API testing)

## Installation

1. Clone the repository: `git clone <repository_url>`
2. Navigate to the project directory: `cd airline-management-system`

## Configuration

1. Configure MySQL Database:
   - Create a new database schema for the application.
   - Update the database configuration in `src/main/resources/application.properties` file with your MySQL connection details.

2. Build the application:
   - Execute the following command: `mvn clean install`

3. Run the application:
   - Execute the following command: `mvn spring-boot:run`

4. Access the application:
   - Open a web browser and visit `http://localhost:8080` to access the Airline Management System.

## Usage

### Customer Features:

1. Registration:
   - Customers can register by providing their details, such as name, email, and password.

2. Flight Search and Booking:
   - Customers can search for flights between routes.
   - The system displays available flights, including departure time, arrival time, and number of empty seats.
   - Customers can select a flight and proceed with the booking process.
   - During the booking process, customers can choose their preferred seating arrangement and make the booking.

### Admin User Features:

1. Add Routes and Flights:
   - Admin users can add new routes and flights to the system.
   - They provide flight details such as route, departure time, arrival time, and flight configuration.

2. Create Flight Configuration:
   - Admin users can create flight configurations to define seating capacity and arrangements for different types of flights.

3. Assign Seats:
   - Seats are assigned automatically at the time of booking based on the available seating arrangements and customer preferences.

## API Documentation

For detailed API documentation and endpoints, please refer to the Postman collection provided with the application.

1. Import the Postman collection `Airline Management System.postman_collection.json`.
2. Explore the available endpoints for different functionalities.

## Contributing

Contributions to the Airline Management System are welcome. If you find any issues or have suggestions for improvement, please create a new issue or submit a pull request.
