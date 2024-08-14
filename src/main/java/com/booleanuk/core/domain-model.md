| Classes  | Variables                | Methods                    | Scenario           | Outcome         |
|----------|--------------------------|----------------------------|--------------------|-----------------|
| `Basket` | `List<Product> products` | `pay(account, sumPrice())` | Pay for products   | Money deducted  |
|          |                          |                            | Insufficient funds | Warning given   |
|          |                          | `receipt()`                | Items in basket    | Receipt printed |
|          |                          |                            | No items in basket | Warning given   |
