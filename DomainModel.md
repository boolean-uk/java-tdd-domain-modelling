# Domain Model

## SupermarketShopper class

### alt1
| Method           | Member Variables | Scenario | Result |
|------------------|------------------|----------|--------|
| searchForItem()  |                  |          |        |
| getItemPrice()   |                  |          |        |
| calculateTotal() |                  |          |        |
|                  |                  |          |        |

### alt2
| Classes              | Methods                                   | Scenario       | Outputs       |
|----------------------|-------------------------------------------|----------------|---------------|
| checkoutClass        | searchForItem(int ID, List<String> items) | If in list     | true          |
|                      |                                           | If not in list | false         |
|                      | getItemPrice(int ID)                      | If             | int price     |
|                      |                                           |                |               |
|                      | calculateTotal(List<int> prices)          |                | int total     |
| shoppingHistoryClass | formatRecipt(List<String> items)          |                | string recipt |
