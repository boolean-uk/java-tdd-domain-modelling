```
As a supermarket shopper,
So that I can pay for products at checkout,
I'd like to be able to know the total cost of items in my basket.
```

## Item

| Class  | Fields  | Methods  | Scenario             | Output           |
|--------|---------|----------|----------------------|------------------|
| `Item` | `price` | `cost()` | if price is positive | return the price |
|        |         |          | otherwise            | throw error      |
|        |         |          |                      |                  |


## Basket

| Class    | Fields       | Methods  | Scenario           | Output                              |
|----------|--------------|----------|--------------------|-------------------------------------|
| `Basket` | `List<Item>` | `cost()` | if an error occurs | catch and print error message       |
|          |              |          | otherwise          | return the total price of the items |


```
As an organised individual,
So that I can evaluate my shopping habits,
I'd like to see an itemised receipt that includes the name and price of the products
I bought as well as the quantity, and a total cost of my basket.
```

## Item

| Class  | Fields  | Methods     | Scenario                                   | Output                                 |
|--------|---------|-------------|--------------------------------------------|----------------------------------------|
| `Item` | `price` | `cost()`    | if price is positive                       | return the price                       |
|        |         |             | otherwise                                  | throw error                            |
|        |         |             |                                            |                                        |
|        | `name`  | `name()`    | if name is not empty                       | return the name                        |
|        |         |             | if price is positive                       | throw error                            |
|        |         |             |                                            |                                        |
|        |         | `details()` | if price is positive and name is not empty | return the name and price concatenated |
|        |         |             | otherwise                                  | throw error                            |


## Basket

| Class    | Fields               | Methods   | Scenario           | Output                                                                        |
|----------|----------------------|-----------|--------------------|-------------------------------------------------------------------------------|
| `Basket` | `Map<Integer, Item>` | `cost()`  | if an error occurs | catch and print error message                                                 |
|          |                      |           | otherwise          | return the total price of the items                                           |
|          |                      |           |                    |                                                                               |
|          |                      | `receipt` | if an error occurs | catch and print error message                                                 |
|          |                      |           | otherwise          | return a String with the quantity and details of each item and the total cost |