
| Methods                              | Members | Scenario               | Result                                       |
|--------------------------------------|---------|------------------------|----------------------------------------------|
| `calculate(List<Integer> itemCosts)` |         | No item prices in list | total = 0                                    |
|                                      |         | n items prices in list | total = sum of n item prices                 |
| `addItem(List<Integer> itemCosts, int newItemCost)`                            |         | Valid itemCost         | Item price gets added at the end of the list |
|                                      |         | Invalid itemCost       | Item doesn't get added + error message       |







| Methods                                         | Members                      | Scenario                                                                     | Result                              |
|-------------------------------------------------|------------------------------|------------------------------------------------------------------------------|-------------------------------------|
| `getNameAndPrice(HashMap<String, Integer> map)` | Hashmap<String, Integer> map | Valid key-value pairs                                                        | return the name and price correctly |
|                                                 | int quantity                 | Missing keys or value                                                        | return error                        |
| `getQuantity()`                                 |                              | Valid quantity (not -1)                                                      | return quantity                     |
|                                                 |                              | Invalid quantity                                                             | return error                        |
| `calculateTotal(String itemName, int quantity)` |                              | itemName exists in the hashmap as a key and a valid value, quantity is valid | return the total price              |
|                                                 |                              | Missing or invalid paramets                                                  | return error                        |






