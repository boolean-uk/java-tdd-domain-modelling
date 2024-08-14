### Exercise

Follow the same process as above to translate these two user stories into domain models.

```
As a supermarket shopper,
So that I can pay for products at checkout,
I'd like to be able to know the total cost of items in my basket.
```
| Classes   | Methods                              | Scenario        | Outputs |
|-----------|--------------------------------------|-----------------|---------|
| `Product` | `Product(String name, double price)` | Create product  |         |
| `Basket`  | `Add(Product)`                       | Add to basket   |         |
|           | `GetItems()`                         | Get items       |         |
|           | `GetTotalPrice()`                    | Calculate total | Double  |


```
As an organised individual,
So that I can evaluate my shopping habits,
I'd like to see an itemised receipt that includes the name and price of the products
I bought as well as the quantity, and a total cost of my basket.
```
| Classes   | Methods                             | Scenario        | Outputs |
|-----------|-------------------------------------|-----------------|---------|
| `Product` | `Product(String name, double price)` | Create product  |         |
| `Basket`  | `Add(Product, int quanity)`         | Add to basket   |         |
|           | `GetTotalPrice()`                   | Calculate total | Double  |
|           | `ItemizeProduct()`                  |                 |         |