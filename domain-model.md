```
As a supermarket shopper,
So that I can pay for products at checkout,
I'd like to be able to know the total cost of items in my basket.
```

| Classes  | Method                             | Scenario            | Outputs    |
|----------|------------------------------------|---------------------|------------|
| `Basket` | `CalculateTotalCost(List<String>)` | If basket has items | Total cost |
|          |                                    | If no items         | 0          |
|          |                                    |                     |            |

```
As an organised individual,
So that I can evaluate my shopping habits,
I'd like to see an itemised receipt that includes the name and price of the products
I bought as well as the quantity, and a total cost of my basket.
```

| Classes  | Method                                            | Scenario            | Outputs                             |
|----------|---------------------------------------------------|---------------------|-------------------------------------|
| `Basket` | `GetItemandPrice(HashMap<String, Integer> items)` | If basket has items | Gets all the items from the Basket  |
|          | `GetQuantityFromBasket()`                         | If basket has items | Quantity of each prodocut in Basket |
|          | `GetTotalPriceandlist()`                          | If basket has items | Total cost and list                 |
