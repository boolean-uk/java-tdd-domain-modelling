Paweł Kwieciński
Jan Rusak


### Exercise

Follow the same process as above to translate these two user stories into domain models.

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

- Add your domain models to this repository as a file named `domain-model`. This should either be a `.md` file like this one, or a screenshot / picture of your work.
- Your model doesn't have to look like the example provided in this file. If you feel like you need more or less columns, feel free to go with that. There is no "right way" to do this kind of thing, we're just designing a system to make our lives easier when it comes to the coding part.

### Solution

| Class     | Attributes    | 
|-----------|---------------|
| `Product` | `String name` |
|           | `int cost`    |

| Classes  | Attributes                           | Methods                                        | Scenario                                                            | Outputs |
|----------|--------------------------------------|------------------------------------------------|---------------------------------------------------------------------|---------|
| `Basket` | `HashMap<Product, Integer> products` | `addProduct(Product product, int quantity)`    | If we want to add a product                                         |         |
|          |                                      | `removeProduct(Product product, int quantity)` | If is in list and given quantity is less or equal than in products  | true    |
|          |                                      |                                                | If product not in list or given quantity is higher than in products | false   |
|          |                                      | `getTotalCost()`                               | What`s the total cost?                                              | int     |
|          |                                      | `getReceipt()`                                 | What`s the receipt?                                                 | String  |
