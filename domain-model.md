# Domain Model
## Exercise 1


`
As a supermarket shopper,
So that I can pay for products at checkout,
I'd like to be able to know the total cost of items in my basket.
`

| Classes | Methods                                     | Scenario                                                        | Outputs       |
|---------|---------------------------------------------|-----------------------------------------------------------------|---------------|
| Shopper | checkout(HashArray<item, price> itemprices) | If the item is on the key of the HashMap, add its value (price) | sum of prices |

## Exercise 2

`
As an organised individual,
So that I can evaluate my shopping habits,
I'd like to see an itemised receipt that includes the name and price of the products
I bought as well as the quantity, and a total cost of my basket.
`

| Classes | Methods                                  | Scenario                                                                                                                                          | Outputs                                                          |
|---------|------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------|
| Shopper | receipt(HashArray<item, price> products) | If the item is on the key of the HashMap, print its key, value and quantity, and add its value (price) for every piece of product that was bought | printed out name, price and quantity, returned sum of the prices |
