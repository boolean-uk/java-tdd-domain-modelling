# 1. Extract domain models from user stories

### Warm up
Michał Klukowski, Rafał Halama

A **User Story** describes one thing a program is expected to do, from the perspective of somebody using that program. When planning a program, the client's requirements will be decomposed into many User Stories. Much of a developer's life is spent translating User Stories into a functional system. These systems are made up of different components, and each component is made up of units. We call these systems **Domain Models**.

There are various different formats for user stories but they all share a common goal: describe a feature the user wants. Here's one style of user story:

```
As a user,
So I can find a specific cohort,
I want to search a list of all cohorts by a cohort name.
```

As a developer, it's our job to extract the useful information into a functional system. Look for nouns and verbs; nouns usually describe entities, verbs usually describe methods.

Here is how one might design a domain model for the above user story:

| Classes         | Methods                                     | Scenario               | Outputs |
|-----------------|---------------------------------------------|------------------------|---------|
| `CohortManager` | `search(List<String> cohorts, String name)` | If name is in list     | true    |
|                 |                                             | If name is not in list | false   |

> **Time to analyse**
>
> Evaluate the user story and the domain model above. What assumptions did the developer have to make and what would you do differently?
> 
> Create your own domain model for the user story above, try to come up with a different solution than the model provided. You can use a table like the one above, a spreadsheet, pen and paper, whatever you'd like. Share your work in your cohorts classroom channel when you're done.

### Exercise

Follow the same process as above to translate these two user stories into domain models.

```
As a supermarket shopper,
So that I can pay for products at checkout,
I'd like to be able to know the total cost of items in my basket.
```

| Classes | Methods              | Fields                 | Scenario       | Outputs          |
|---------|----------------------|------------------------|----------------|------------------|
| Basket  | calculateTotalCost() | List<Product> products | List empty     | 0                |
|         |                      |                        | List not empty | cost of products |
| Product |                      | Double cost            |                |                  |
|         |                      |                        |                |                  |

```
As an organised individual,
So that I can evaluate my shopping habits,
I'd like to see an itemised receipt that includes the name and price of the products
I bought as well as the quantity, and a total cost of my basket.
```

- Add your domain models to this repository as a file named `domain-model`. This should either be a `.md` file like this one, or a screenshot / picture of your work.
- Your model doesn't have to look like the example provided in this file. If you feel like you need more or less columns, feel free to go with that. There is no "right way" to do this kind of thing, we're just designing a system to make our lives easier when it comes to the coding part.

| Classes | Methods                  | Fields                                                                  | Scenario                       | Outputs                                                                                       |
|---------|--------------------------|-------------------------------------------------------------------------|--------------------------------|-----------------------------------------------------------------------------------------------|
| Basket  | calculateTotalCost()     | Map<Product, Integer> products                                          | Map empty                      | 0                                                                                             |
|         |                          |                                                                         | Map not empty                  | cost of products                                                                              |
|         | calculateQuantity()      | Map<Product, Integer> products                                          | Map empty                      | 0                                                                                             |
|         |                          |                                                                         | Map not empty                  | quantity of products                                                                          |
|         | getReceipt()             | Map<Product, Integer> products                                          | User asks for a receipt        | new Receipt(products, calculateTotalCost(), calculateQuantity(), person)                      |
|         |                          | Person person                                                           |                                |                                                                                               |
| Product |                          | String name                                                             |                                |                                                                                               |
|         |                          | Double cost                                                             |                                |                                                                                               |
| Receipt | toString()               | Map<,> products, Double totalCost, Integer totalQuantity, Person person |                                | Shows the content of the receipt, total quantity and cost of products, and the name ofa buyer |
| Person  | evaluateShoppingHabits() | List<Receipt> receipts                                                  | User wants to see his receipts | Shows the full list of receipts in a nice, readable way                                       |
|         |                          | String name                                                             |                                |                                                                                               |


Michał Klukowski, Rafał Halama