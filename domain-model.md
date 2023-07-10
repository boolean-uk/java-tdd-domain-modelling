### Exercise
```
As a supermarket shopper,
So that I can pay for products at checkout,
I'd like to be able to know the total cost of items in my basket.
```

```
As an organised individual,
So that I can evaluate my shopping habits,
I'd like to see an itemised receipt that includes the name and price of the products
I bought as well as the quantity, and a total cost of my basket.
```
| Classes      | Methods                                 | Scenario                 | Outputs     |
|--------------|-----------------------------------------|--------------------------|-------------|
| ` Products ` | add(List<String> products, String name) | if its *not in* the list | true        |
|              |                                         | if its *in* the list     | false       |
| ` Basket`    | Calculate total(List<String> Products ) | Sum of the price         | Total price |