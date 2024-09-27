### Exercise

Follow the same process as above to translate these two user stories into domain models.

```
As a supermarket shopper,
So that I can pay for products at checkout,
I'd like to be able to know the total cost of items in my basket.
```

| Classes      | Attribute                 | Methods                                 | Scenario                   | Outputs     |
|--------------|---------------------------|-----------------------------------------|----------------------------|-------------|
| ` Products ` | Product name and price    | add(List<String> cohorts, String name)  | add it to the basket array | true        |
| ` Basket`    | Total Price, product name | Calculate total(List<String> Products ) | Sum of the price           | Total price |

```
As an organised individual,
So that I can evaluate my shopping habits,
I'd like to see an itemised receipt that includes the name and price of the products
I bought as well as the quantity, and a total cost of my basket.
```

| Classes    | Attribute                                 | Methods                                 | Scenario                       | Outputs              |
|------------|-------------------------------------------|-----------------------------------------|--------------------------------|----------------------|
| ` Product` | Product name and price                    | add(List<String> products, String name) | add each product to the basket | true                 |
| ` Basket`  | Total Price and quantity for each product | print bill(List<Products>               | name and price                 | Total price and name |


- Add your domain models to this repository as a file named `domain-model`. This should either be a `.md` file like 
this one, or a screenshot / picture of your work.
- Your model doesn't have to look like the example provided in this file. If you feel like you need more or less 
columns, feel free to go with that. There is no "right way" to do this kind of thing, we're just designing a 
system to make our lives easier when it comes to the coding part.