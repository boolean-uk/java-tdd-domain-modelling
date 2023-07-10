Miłosz Sobczyk,
Julia Girejko

```
As a supermarket shopper,
So that I can pay for products at checkout,
I'd like to be able to know the total cost of items in my basket.
```

| Classes  | Methods            | Scenario   | Outputs                       |
|----------|--------------------|------------|-------------------------------|
| Basket   | double totalCost() | Every case | Total cost of items in basket |


```
As a supermarket shopper,
So that I can restock my cupboards,
I want to add products into my basket.

As a supermarket shopper,
So that I can pay for products at checkout,
I'd like to be able to know the total cost of items in my basket.
```

| Classes | Methods                  | Scenario                 | Outputs                       |
|---------|--------------------------|--------------------------|-------------------------------|
| Basket  | void add(string product) | If product exists        |                               |
|         |                          | Id product doesn't exist | Exception                     |
|         | double totalCost()       | Every case               | Total cost of items in basket |
 