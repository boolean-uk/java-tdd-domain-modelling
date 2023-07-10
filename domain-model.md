```
As a supermarket shopper,
So that I can pay for products at checkout,
I'd like to be able to know the total cost of items in my basket.
```

| Classes | Attributes          | Methods                            | Output                            |
|---------|---------------------|------------------------------------|-----------------------------------|
| Product | double price        | getPrice(), setPrice(double price) | gets the price                    |
|         | String name         | getName(), setName(String name)    | gets the name                     |
| Basket  | Product [] products | addProduct(Product product)        |                                   |
|         |                     | removeProduct(Product product)     |                                   |
|         |                     | getProduct(Product)                | returns Product object            |
| Shopper | Basket basket       | pay(Basket basket)                 |                                   |
|         |                     | getTotalCost(Basket basket)        | returns total cost                |
|         |                     | getReceipt(Basket)                 | returns what the basket contained |


```
As an organised individual,
So that I can evaluate my shopping habits,
I'd like to see an itemised receipt that includes the name and price of the products
I bought as well as the quantity, and a total cost of my basket.
```