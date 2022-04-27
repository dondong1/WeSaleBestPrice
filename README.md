# WeSaleBestPrice

    An e-commercial website

# Back End Technologies:

- Java JDK 17
- Java Framework: Spring Boot 2.6.7
- Dependencies: Security, Lombok, JWT, MySQL connector,Jpa...
- Database: MySql
- IDE: Intelij

# Database Design:

- users: id, address, created_at, email, is_email_verified, login_token, mobile, name, password, type
- products: id, name, price, added_on, category_id
- checkout_cart: delivery_addresss, oder_date, order_id, payment_type, price, qty, user_id, product_id
- category: id, added_on, category_id, name, price
- adde_tocart: id, added_date, price, qty, user_id, product_id

![picture alt](/1.png "Database")

# Spring Boot Architecture:

- Controller -> Service -> Repository -> (data) -> Service -> Controller -> Web/Web Client.
