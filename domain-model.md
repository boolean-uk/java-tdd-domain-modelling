# Domain model

## Supermarket shopper

```
As a supermarket shopper,
So that I can pay for products at checkout,
I'd like to be able to know the total cost of items in my basket.
```

| Class              | Methods                                 | Fields               | Scenario                | Outputs                  |
|--------------------|-----------------------------------------|----------------------|-------------------------|--------------------------|
| SupermarketManager | `calculateTotalCost(List<Item> basket)` |                      | adding prices in basket | return total basket cost |
|                    | `calculateTotalCost()`                  | `List<Item> basket`  |                         | total basket cost        |



##  As an organised individual

```
As an organised individual,
So that I can evaluate my shopping habits,
I'd like to see an itemised receipt that includes the name and price of the products
I bought as well as the quantity, and a total cost of my basket.
```


| Class          | Methods                              | Fields               | Scenario                           | Output                                 |
|----------------|--------------------------------------|----------------------|------------------------------------|----------------------------------------|
| ReceiptManager | `showTotalBasket(List<Item> basket)` |                      | Show total cost and quantity items | return total cost and quantity items   |
|                | `showTotalBasket()`                  | `List<Item> basket`  |                                    | return total cost and quantity items   |

