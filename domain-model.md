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

