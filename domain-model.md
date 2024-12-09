```
As a supermarket shopper,
So that I can pay for products at checkout,
I'd like to be able to know the total cost of items in my basket.
```

| Classes         | Methods                                       | Scenario    | Outputs |
|-----------------|-----------------------------------------------|-------------|---------|
| `MarketManager` | `totalCost(HashMap<String, Integer> items)`   | Always true | Integer |

```
As an organised individual,
So that I can evaluate my shopping habits,
I'd like to see an itemised receipt that includes the name and price of the products
I bought as well as the quantity, and a total cost of my basket.
```

| Classes          | Methods                              | Scenario                         | Outputs                  |
|------------------|--------------------------------------|----------------------------------|--------------------------|
| `ReceiptManager` | `itemisedReceipt(List<String> name)` | when List<String> name is filled | HashMap<String, Integer> |
|                  |                                      | when List<String> name is empty  | 0                        |

