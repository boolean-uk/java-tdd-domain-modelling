# Exercise 1

## Exercise 1A
| Classes  | Member                | Methods        | Scenario                            | Outputs                     |
|----------|-----------------------|----------------|-------------------------------------|-----------------------------|
| `Basket` | `List<Product> items` | `totalPrice()` | If there are items in the basket    | Return total price of items |
|          |                       |                | If there are no items in the basket | Return 0                    |

| Classes   | Member         | 
|-----------|----------------|
| `Product` | `String name`  | 
|           | `double price` | 
|           | `int quantity` | 

## Exercise 1B
| Classes   | Member          | Methods       | Scenario           | Outputs                       |
|-----------|-----------------|---------------|--------------------|-------------------------------|
| `Receipt` | `Basket basket` | `getBasket()` | If basket exists   | Return basket                 |
|           |                 |               | If basket is null  | Return null                   |
|           |                 | `toString()`  | If basket exists   | Return message*               |
|           |                 |               | If basket is null  | Return "empty basket" message |
*With Product name, price and quantity, and Basket totalPrice()