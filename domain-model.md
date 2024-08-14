# Domain model

<!-- TOC -->
* [Domain model](#domain-model)
  * [User stories](#user-stories)
    * [User story 1](#user-story-1)
    * [User story 2](#user-story-2)
  * [Classes](#classes)
    * [Product Class](#product-class)
    * [Shopping Basket Class](#shopping-basket-class)
<!-- TOC -->

## User stories
### User story 1
```
As a supermarket shopper,
So that I can pay for products at checkout,
I'd like to be able to know the total cost of items in my basket.
```

### User story 2
```
As an organised individual,
So that I can evaluate my shopping habits,
I'd like to see an itemised receipt that includes the name and price of the products
I bought as well as the quantity, and a total cost of my basket.
```

## Classes

### Product Class
| Variables          | Description                | 
|--------------------|----------------------------|
| String productID   | ID of the product          |
| String productName | Name of the product        |
| String description | Description of the product |
| Float price        | Price of the product       | 


### Shopping Basket Class
| Variables                                    | Description                                                          |
|----------------------------------------------|----------------------------------------------------------------------|
| List<Product product, Integer quantity> basket | Contains all the products in the user's basket                       | 
 | String customerID | Contains the ID of the customer                                      |
 | Boolean paymentCompleted | Is true if the payment of the basket is completed. False by default. |


| Methods                                              | Scenario                                           | Outputs                 |
|------------------------------------------------------|----------------------------------------------------|-------------------------|
| `Void addItem(Product product, Integer quantity)`    | Customer adds product(s) to basket                 | -                       |
| `Void removeItem(Product product, Integer quantity)` | Customer removes product(s) from basket            | -                       |
| `Float summarizeBasket(Basket basket)`               | If basket is empty                                 | Return 0                | 
|                                                      | If basket is not empty                             | Return sum              |
| `Void completePayment(Basket basket)`                | If basket is empty                                 | Return error            |
|                                                      | If basket is not empty and payment is successful   | -                       |
|                                                      | If basket is not empty and payment is unsuccessful | Return error            |
| `String createReceipt(Basket basket)`                | If basket.paymentCompleted == true                 | Return itemised receipt |
|                                                      | If basket.paymentCompleted == false                | Return error            |

