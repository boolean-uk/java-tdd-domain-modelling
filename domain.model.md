### Exercise

Follow the same process as above to translate these two user stories into domain models.

```
As a supermarket shopper,
So that I can pay for products at checkout,
I'd like to be able to know the total cost of items in my basket.
```

| Classes        | Members                         | Methods          | Scenario                                            | Outputs                     |
|----------------|---------------------------------|------------------|-----------------------------------------------------|-----------------------------|
| `ShoppingCart` | `Map<Product, Double> products` | `getTotalCost()` | If there are items summarize total cost             | Total cost of shopping cart |
|                |                                 |                  | If there are no items show message about empty cart | Message: cart is empty      |

| Classes   | Members        | 
|-----------|----------------|
| `Product` | `String name`  |
|           | `Double price` |

```
As an organised individual,
So that I can evaluate my shopping habits,
I'd like to see an itemised receipt that includes the name and price of the products
I bought as well as the quantity, and a total cost of my basket.
```

| Classes    | Members                  | Methods        | Scenario                                                                 | Outputs                                                                                              |
|------------|--------------------------|----------------|--------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------|
| `Customer` | `List<Receipt> receipts` | `getReceipt()` | Calculate total value of cart depending on `products` price and quantity | New instance of class `Receipt` with fields: `Map<Product, Double> products`,`BigDecimal totalValue` |
|            |                          |                |                                                                          |                                                                                                      |

| Classes   | Members                         |
|-----------|---------------------------------|
| `Receipt` | `Map<Product, Double> products` |