
![E2](https://github.com/user-attachments/assets/d125c566-3434-47c0-95e6-2f0b67d89f9f)
![E3](https://github.com/user-attachments/assets/3afe8a3c-9965-4d6f-bb5a-6a3f2b30e6e7)

Steps to Setup
Clone the repository:

bash
Copy code
git clone <repository-url>
cd <repository-folder>
Build the project using Maven:

bash
Copy code
mvn clean install
Run the application:

bash
Copy code
mvn spring-boot:run
The application will start on http://localhost:8080.

Access the H2 database console:

URL: http://localhost:8080/h2-console
JDBC URL: jdbc:h2:mem:testdb
Username: sa
Password: password (if required)

![E4](https://github.com/user-attachments/assets/29902ac5-cddc-4af7-bb9c-b328a354d135)

Order Management
Method	Endpoint	Description
POST	/api/order/place	Place an order
Database Schema
The application uses the following entities:

Product: Represents a product with attributes like name, category, and price.
Cart: Represents a shopping cart containing CartItem entities.
CartItem: Represents an individual item in the cart.
Order: Represents an order placed for the items in the cart.
Sample Data
You can insert sample data into the Product table to test the application. For example:

sql
Copy code
INSERT INTO product (category, name, price) VALUES ('Electronics', 'Laptop', 500);
INSERT INTO product (category, name, price) VALUES ('Fashion', 'T-shirt', 20);



