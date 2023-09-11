
```
As a supermarket shopper,
So that I can pay for products at checkout,
I'd like to be able to know the total cost of items in my basket.
```

| Classes     | Methods                                            | Scenario                                                 | Results                 |
|-------------|----------------------------------------------------|----------------------------------------------------------|-------------------------|
| basketClass | iterate trough Hashmap(String itemName, int price) | if item is in hashmap                                    | get price               |
|             |                                                    |                                                          |                         |
| basketClass | sum itemPrice * amount                             | multiply the price by the amount of the specific product | output totalItemPrice   |
|             |                                                    |                                                          |                         |
| basketClass | sum totalItemPrice + totalItemPrice                | add price of all items and totalItemPrice                | output totalPriceBasket |



```
As an organised individual,
So that I can evaluate my shopping habits,
I'd like to see an itemised receipt that includes the name and price of the products
I bought as well as the quantity, and a total cost of my basket.
```

| Classes     | Methods                                                                                | Scenario                                                 | Results                      |
|-------------|----------------------------------------------------------------------------------------|----------------------------------------------------------|------------------------------|
| basketClass | iterate trough hashmap(hashmap itemName, int price)                                    | if item is in hashmap                                    | get  price                   |
|             |                                                                                        |                                                          |                              |
| basketClass | sum itemPrice + itemPrice1 etc.                                                        | add price of all items                                   | total price                  |
|             |                                                                                        |                                                          |                              |
| basketClass | sum itemPrice * timesBought                                                            | multiply the price by the amount of the specific product | total price for that product |
|             |                                                                                        |                                                          |                              |
| basketClass | create receipt ArrayList(String, int amount, int totalItemPrice, int totalPriceBasket) | put all information together                             | return receipt               |