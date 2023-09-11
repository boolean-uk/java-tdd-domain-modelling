# Exercise 1
Translate the two following user stories into domain models.

## User Story 1
```
As a supermarket shopper,
So that I can pay for products at checkout,
I'd like to be able to know the total cost of items in my basket.
```

### Domain Model Suggestion

| Class   | Method                                           | Class Member                           | Result           | 
|---------|--------------------------------------------------|----------------------------------------|------------------|
| Basket  | calculateCost(HashMap<String,Integer> priceList) | HashMap<String,Integer> itemQuantities | Total Cost (int) |

## User Story 2
```
As an organised individual,
So that I can evaluate my shopping habits,
I'd like to see an itemised receipt that includes the name and price of the products
I bought as well as the quantity, and a total cost of my basket.
```

### Domain Model Suggestion

| Class  | Method                                            | Class Member                           | Result                                                                                                               |
|--------|---------------------------------------------------|----------------------------------------|----------------------------------------------------------------------------------------------------------------------|
| Basket | exportAnalysis(HashMap<String,Integer> priceList) | HashMap<String,Integer> itemQuantities | Itemised Receipt (HashMap<String,int[]> where the int array contains one value for quantity and one value for price) |
