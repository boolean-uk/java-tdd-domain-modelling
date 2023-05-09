### Warm up
```
As a user,
So I can find a specific cohort,
I want to search a list of all cohorts by a cohort name.
```

| Classes         | Attributes                | Methods                        | Scenario               | Outputs           |
|-----------------|---------------------------|--------------------------------|------------------------|-------------------|
| `CohortManager` | `cohorts: List<Cohort>`   |                                |                        |                   |
|                 |                           | `search(String name): Cohort`  | If name is in list     | Cohort Object     |
|                 |                           |                                | If name is not in list | null OR Exception |
| `Cohort`        | `name: String`            |                                |                        |                   |
|                 | `students: List<Student>` |                                |                        |                   |
| `Student`       |                           |                                |                        |                   |


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

| Classes         | Attributes                         | Methods                      | Scenario                                                 | Outputs                    |
|-----------------|------------------------------------|------------------------------|----------------------------------------------------------|----------------------------|
| `BasketManager` |                                    | `printTotalCost(): void`     | user wants to know the total cost of items in his basket | Print total                |
|                 |                                    |                              | no items in the basket                                   | Print empty basket message |                           |                                    |                              |                                             |                           |
| `BasketManager` |                                    | `getReceipt(): void`         | User asks for receipt                                    | Print Receipt              |
|                 |                                    |                              | If no items in basket                                    | Print empty basket message |
| `Basket`        | `products: Map <Product, Integer>` |                              |                                                          |                            |
|                 | `totalCost: BigDecimal`            |                              |                                                          |                            |
|                 |                                    | `getTotalCost(): BigDecimal` | Everytime we need to print cost                          | totalCost of items         |
|                 |                                    | `calculateTotalCost(): void` | Everytime we need to print cost                          | -                          |
|                 |                                    | `toString(): String`         | could use instead of getReceipt or together              | Receipt style output       |
| `Product`       | `name: String`                     |                              |                                                          |                            |
|                 | `cost: BigDecimal`                 |                              |                                                          |                            |