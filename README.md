
# BE-Coding-Assessment

Product and Subscription service:
The task is to build a data model and a REST-based service implementing the features of the following story in Java using SpringBoot.

Implement (code) the REST endpoints for one or two of the user stories defined below. The logic should use SQL in-memory or external databases to CRUD the data.

User Story

As a User, I should be able to select a product from the list and get a subscription plan for the selected product. A user can have only one active subscription per product. AC:
1. I can fetch a list of products.
2. I can fetch a single product.
3. I can buy a subscription for a single product.
4. I can fetch the following information related to my subscription (e.g. start date, end date, duration of the subscription, price, product).
5. I can pause and resume my subscription.
6. I can cancel my active subscription.


# Step-by-step guide:

Navigate to Project Directory:
- Open a terminal or command prompt and navigate to the root directory of your Spring Boot project where the pom.xml file is located.

Run the Application:
- Execute the following command to run your Spring Boot application:
  - mvn spring-boot:run
    - This command will compile your code, package it into a JAR file, and start the Spring Boot application.

Access the Application:
- By default, your Spring Boot application will run on port 8080. Open your web browser or use Postman to access the API endpoints. For example: URL: http://localhost:8080/{key}
You can replace the key with the endpoint you want to access.

Using Postman:

- Open Postman and import BE-CODE collection. Set the HTTP method (GET, POST, etc.).
  -  saveProduct
  -  productList
  -  getProductById
  -  buySubscription
  -  getSubscriptionById
  -  pauseSubscription
  -  resumeSubscription
  -  cancelSubscription
  and Click "Send" to make the request. 

  If you have any questions, feel free to ask :)
  - Best Regards,
    - Raphaela Souza
  
