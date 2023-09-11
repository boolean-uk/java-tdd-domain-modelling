# Example Domain Model

## User Story

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

## Domain Model

| Classes            | Attributes                                               | Methods                   |   |
|--------------------|----------------------------------------------------------|---------------------------|---|
| SupermarketShopper | Name                                                     | initialize name           |   |
| Basket             | ArrayList<String> products                               | add product to basket     |   |
|                    |                                                          | calculate final price     |   |
| Product            | Hashmap with products and prices                         | initialize name and price |   |
| Receipt            | ArrayList<String> products, price, quantity, total costs | generate receipt          |   |
