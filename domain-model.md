# Exercise 1

### Class: `ShoppingBasket`

| Method                   | Member variables    | Scenario          | Result                                                                        |
|--------------------------|---------------------|-------------------|-------------------------------------------------------------------------------|
| `double calculateCost()` | `List<Item> items`  | Basket is empty   | Return $0$                                                                    |
|                          |                     | Basket has items  | Return total cost of the items ($>0$)                                         |
| `void printReceipt()`    |                     | Basket is empty   | Print "empty" message                                                         |
|                          |                     | Basket has items  | For every unique item, print name, price and quantity. Also print total cost. |

### Class: `Item`

| Method              | Member variables | Scenario | Result                        |
|---------------------|------------------|----------|-------------------------------|
| `double getprice()` | `double price`   |          | Return the price of the item. |
| `String getName()`  | `String name`    |          | Return the name of the item.  |

