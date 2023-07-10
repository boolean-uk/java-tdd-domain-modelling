# Domain Model



## Mikołaj Szkaradek, Ilias Belghoul



```markdown
As a user,
So I can find a specific cohort,
I want to search a list of all cohorts by a cohort name.
```



| Classes       | Methods                                     | Fields | Scenario               | Outcome      |
| ------------- | ------------------------------------------- | ------ | ---------------------- | ------------ |
| CohortManager | search(List\<String\> cohorts, String name) |        | If name is in list     | Return true  |
|               |                                             |        | If name is not in list | Return false |



```markdown
As a supermarket shopper,
So that I can pay for products at checkout,
I'd like to be able to know the total cost of items in my basket.
```

| Classes | Methods                 | Fields                    | Scenario                        | Outcome                          |
| ------- | ----------------------- | ------------------------- | ------------------------------- | -------------------------------- |
| Product | getPrice()              | Double price, String name |                                 |                                  |
| Basket  | getTotalProductsPrice() | List\<Product\> products  | If list contains n > 0 products | Return total price of n products |
|         |                         |                           | If list contains 0 products     | Return 0                         |
|         |                         |                           |                                 |                                  |





```markdown
As an organised individual,
So that I can evaluate my shopping habits,
I'd like to see an itemised receipt that includes the name and price of the products
I bought as well as the quantity, and a total cost of my basket.
```

| Classes     | Methods                                              | Fields                       | Scenario               | Outcome                                                      |
| ----------- | ---------------------------------------------------- | ---------------------------- | ---------------------- | ------------------------------------------------------------ |
| Receipt     | (Receipt is alias for Map<String, Pair<Double,Int>>) |                              |                        |                                                              |
| Product     | getPrice()                                           | Double price, String name    |                        |                                                              |
| Basket      | getTotalProductsPrice()                              | Map\<Product, Int\> products |                        |                                                              |
| shopManager | generateReceipt(Basket) -> Receipt                   |                              | If basket is not empty | Return a receipt containing all products with prices and quantities |
|             |                                                      |                              | If basket is empty     | Return empty receipt                                         |

