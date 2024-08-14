

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

## Domain-model for shopping cart

| Classes      | Variables                                       | Methods                          | Scenario                                                          | Outcome                                                                                  |
|--------------|-------------------------------------------------|----------------------------------|-------------------------------------------------------------------|------------------------------------------------------------------------------------------|
| `CartManager` | `private HashMap<String, Integer> shoppingCart` |                                  |                                                                   |                                                                                          |
|              | ` private int totalCost                    `    |                                  |                                                                   |                                                                                          |
|              | `static HashMap<String, Integer> itemCostMap`   |                                  |                                                                   |                                                                                          |
|              |                                                 | `addItem(String item)`           | Shopper adds an item to cart                                      | Item is added to cart. If it exists, increment quantity counter. totalCost is updated.   |
|              |                                                 | `addItem(String item, int x)`    | Add x items to cart                                               | x items is added to cart. update totalCost                                               |
|              |                                                 | `removeItem(String item, int x)` | Shopper removes x items from cart                                 | x items are removed from cart. update totalCost                                          |
|              |                                                 | `removeItem(String item)`        | Shopper removes an item from the cart                             | If item is in cart, decrement the quantity counter. totalCost is updated.                |
|              |                                                 | `removeAllOfItem(String item)`   | Shopper removes all quantities of item from cart                  | Item entry is removed from the cart map.  totalCost is updated.                          |
|              |                                                 | `getTotalCost()`                 | Shopper wants to know the total cost                              | Shopper gets the total cost of items in the cart.                                        | 
|              |                                                 | `getQuantityOfItem(String item)` | Shopper wants to know the quantity of an item in the cart         | Shopper gets the quantity of a given item from the cart.                                 |
|              |                                                 | `getItemizedReciept()`           | Shopper wants to see an overview of all items in cart and total cost | Shopper gets the total cost of all items, and a list of how many items and the per-price |


