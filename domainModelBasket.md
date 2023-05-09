| Classes  | Methods                                       | Scenario                                                                              | Outputs |
|----------|-----------------------------------------------|---------------------------------------------------------------------------------------|---------|
| Shopper	 | `addToBasket(Product product, int quantity)	` | Adds a Product with the specified quantity to the basket	                             |         |
|          | `getBasketTotalCost()`                        | Calculates and returns the total cost of items in the basket                          | double  |
|          | `removeProduct(Product product,int quantity)` | Remove a Product with the specified quantity to the basket                            |         |
|          | `checkout()`                                  | Pay the price of the products return the Basket and remove everything from the basket | Basket  |
| Product  |                                               | Represents a product in the supermarket                                               |         |
|          | `getPrice()`                                  | Retrieves the price of the product                                                    | double  |
|          | `getName()`                                   | Retrieves the name of the product                                                     | String  |
| Basket   | `addProduct(Product product, int quantity)`   | Adds a Product with the specified quantity to the basket                              |         |
|          | `removeProduct(Product product,int quantity)` | Remove a Product with the specified quantity to the basket                            |         |
|          | `calculateTotalCost()`                        | Calculates and returns the total cost of items in the basket                          | double  |

````
As a supermarket shopper,
So that I can pay for products at checkout,(total price for product in basket)
I'd like to be able to know the total cost of items in my basket.

As an organised individual,
So that I can evaluate my shopping habits,
I'd like to see an itemised receipt that includes the name and price of the products
I bought as well as the quantity, and a total cost of my basket.