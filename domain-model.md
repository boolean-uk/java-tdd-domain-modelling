# Domain Model

## CohortManager Class

| Method                       | Member Variables             | Scenario                  | Result       |
|------------------------------|------------------------------|---------------------------|--------------|
|                              | ArrayList<String> cohortList |                           |              |
| searchForCohort(String name) |                              | Name is in cohortList     | Return true  |
|                              |                              | Name is not in cohortList | Return false |


1.

## SupermarketCashier Class

| Method                                   | Member Variables | Scenario                                          | Result           |
|------------------------------------------|------------------|---------------------------------------------------|------------------|
|                                          | int totalCost    |                                                   |                  |
| calculateCost(ArrayList<Item> groceries) |                  | Calculates the accumulated value of the groceries | Return totalCost |
|                                          |                  | List is null                                      | Return -1        |


2.
| Method                                  | Member Variables   | Scenario                                                                 | Result |
|-----------------------------------------|--------------------|--------------------------------------------------------------------------|--------|
|                                         | Receipt newReceipt |                                                                          |        |
| printReceipt(ArrayList<Item> groceries) |                    | Creates a receipt with createReceipt and prints the data to the terminal |        |
|                                         |                    | Is unable to create a receipt. Prints error-message to the terminal      |        |

| Method                                   | Member Variables   | Scenario                                                            | Result            |
|------------------------------------------|--------------------|---------------------------------------------------------------------|-------------------|
|                                          | Receipt newReceipt |                                                                     |                   |
| createReceipt(ArrayList<Item> groceries) |                    | Creates a new receipt with the requested information and returns it | Return newReceipt |
|                                          |                    | List is null                                                        | Return null       |

