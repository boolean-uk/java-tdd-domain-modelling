| Classes   | Methods                                               | Scenario                                           | Outputs           |
|-----------|-------------------------------------------------------|----------------------------------------------------|-------------------|
| `Shopper` | `addProduct(List<Product> basket,Product product)`    | add Product to the list                            | void              |
|           | `removeProduct(List<Product> basket,Product product)` | if Product exist remove                            | Product           |
|           | `findProduct(List<Product> basket,Product product)`   | if basket containts =>                             | true              |
|           |                                                       | if basket doesnt containts                         | false             |
|           | `total(List<Product> basket)`                         | iterate over list and get sum of price of products | int               |
|           | `checkout(List<Product> basket)`                      | remove all items in List and pay?                  | new List<Product> |

````
As a supermarket shopper,
So that I can pay for products at checkout,(total price for product in basket)
I'd like to be able to know the total cost of items in my basket.
````