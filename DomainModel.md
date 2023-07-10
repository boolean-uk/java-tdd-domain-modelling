# Domain Model


```
As a supermarket shopper,
So that I can pay for products at checkout,
I'd like to be able to know the total cost of items in my basket.
```

| Class  | Method                                | Output                               |
|--------|---------------------------------------|--------------------------------------|
| Basket | pay(HashMap<String, Double> products) | total cost of items in user's basket |

| Basket                     | Items             |
|----------------------------|-------------------|
| List<Items>                | String name       |
| void addItem(Item item)    | double price      |
| void removeItem(Item item) | String getName()  |
| double calculateCost()     | double getPrice() |

```
As an organised individual,
So that I can evaluate my shopping habits,
I'd like to see an itemised receipt that includes the name and price of the products
I bought as well as the quantity, and a total cost of my basket.
```

| Basket                     | Items                | Receipt                |
|----------------------------|----------------------|------------------------|
| List<Items> basketItems    | String name          | double sum             |
|                            | double price         | List<Items> yourItems  |
|                            | double quantity      |                        |
|                            |                      |                        |
| void removeItem(Item item) | String getName()     | List<Items> getItems() |
| double calculateCost()     | double getPrice()    | double getSum()        |
| Receipt generateReceipt()  | double getQuantity() |                        |
| void addItem(Item item)    |                      |                        |
