```
As a supermarket shopper,
So that I can pay for products at checkout,
I'd like to be able to know the total cost of items in my basket.
```

| Classes         | Methods                 | Scenario                 | Outputs                |
|-----------------|-------------------------|--------------------------|------------------------|
| `Item`          | `getName()`             | Retrieve item's name     | String                 |
|                 | `getPrice()`            | Retrieve item's price    | Integer                |
| `Basket`        | `addItem(Item item)`    | Add item to basket       | HashMap<Item, Integer> |
|                 | `removeItem(Item item)` | Remove item from basket  | HashMap<Item, Integer> |
|                 | `calculateTotalCost()`  | Calculate the total cost | Integer                |
| `MarketShopper` | `checkout()`            | checkout                 | Integer                |
```
As an organised individual,
So that I can evaluate my shopping habits,
I'd like to see an itemised receipt that includes the name and price of the products
I bought as well as the quantity, and a total cost of my basket.
```


| Classes      | Methods                 | Scenario                   | Outputs                |
|--------------|-------------------------|----------------------------|------------------------|
| `Product`    | `getName()`             | Retrieve product's name    | String                 |
|              | `getPrice()`            | Retrieve product's price   | Integer                |
| `Basket`     | `addItem(Item item)`    | Add product to basket      | HashMap<Item, Integer> |
|              | `removeItem(Item item)` | Remove product from basket | HashMap<Item, Integer> |
|              | `calculateTotalCost()`  | Calculate the total cost   | Integer                |
|              | `generateReceipt`       | Generate itemised receipt  | String                 |
| `Individual` | `checkout()`            | checkout                   | Integer                |