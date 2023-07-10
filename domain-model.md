```
As a supermarket shopper,
So that I can pay for products at checkout,
I'd like to be able to know the total cost of items in my basket.
```
| Classes  | Methods                                                    | Scenario                                  | Outputs |
|----------|------------------------------------------------------------|-------------------------------------------|---------|
| `Basket` | `pay(List<Product> products, PaymentMethod paymentMethod)` | If payment was successful                 | true    |
|          |                                                            | If payment was not successful             | false   |
|          | `countTotalCost(List<Product> products)`                   | Count total cost of all products as value | value   |


```
As an organised individual,
So that I can evaluate my shopping habits,
I'd like to see an itemised receipt that includes the name and price of the products
I bought as well as the quantity, and a total cost of my basket.
```
| Classes      | Methods                    | Scenario            | Outputs   |
|--------------|----------------------------|---------------------|-----------|
| `MyPayments` | `evaluate(Person person)`  | If person exist     | Summary   |
|              |                            | If not person exist | exception |
