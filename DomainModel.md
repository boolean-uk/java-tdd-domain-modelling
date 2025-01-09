# Domain Model

## CohortManager Class

| Method  | Variables  | Scenario  | Output  |
|---|---|---|---|
|   | ArrayList\<String> cohorts |   |   |
| search(String name)  |   | Found name in cohorts  | return true  |
|   |   | Did not find name in cohorts  | return false  |

## ShoppingCart Class

| Method  | Variables  | Scenario  | Output  |
|---|---|---|---|
|   | ArrayList\<ShopItem> cart |   |   |
| getTotalCost()  |   | valid total cost  | return total cost of items in basket  |
|   |   | invalid total cost  | return -1  |
| getReceipt()  |   | valid list of items  | return receipt String  |
|   |   | invalid list of items  | return null  |
| addItem(ShopItem item)  |   | valid item  | add item to cart  |
|   |   | invalid item  | throw error|

## ShopItem Class
| Method  | Variables  | Scenario  | Output  |
|---|---|---|---|
|   | String name  |   |   |
|   | Float price  |   |   |
| getPrice()  |   |   | return price  |

