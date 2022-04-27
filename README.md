# WeSaleBestPrice

    An e-commercial website

# Back End Technologies:

- Java JDK 17
- Java Framework: Spring Boot 2.6.7
- Dependencies: Json, Security, JWT, Lombok, MySQL connector,Jpa...
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

# JWT implementation (JSON WEB TOKEN)

- We use this for API authorization. Whenever user want to access an API, you will need to provide JSON web token to the server:
- There are 3 parts: Header - Payload (information about the owner of the token) - Signature.
- One application communcation to another application will also need this token.
- Testing http://localhsot:7090/api/login/user
  with test case: {"mobile": 9164725749, "password": "testpassword"}
  will give a token as following:
  ![picture alt](/2.png "Database")
