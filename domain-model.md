| Classes       | Member variables                                | Methods                                                            | Scenario                         | Outcomes                                              |
|---------------|-------------------------------------------------|--------------------------------------------------------------------|----------------------------------|-------------------------------------------------------|
| `Supermarket` | `HashMap<String product, Integer price> products` | `calculateTotal(HashMap<String product, Integer quantity> basket)` | Empty basket<br/>Items in basket | Return "Basket is empty"<br/>Return total cost of items |





| Classes   | Member variables                                                                                         | Methods                                   | Scenario                                                                          | Outcomes                                                                                                                    |
|-----------|----------------------------------------------------------------------------------------------------------|-------------------------------------------|-----------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------|
| `Receipt` | `HashMap<String product, Integer price> products`<br/>`HashMap<String product, Integer quantity> basket` | `calculateTotal()`<br/><br/>`itemizeReceipt()` | Empty basket<br/>Products in basket<br/>Payment not complete<br/>Payment complete | Return "Basket is empty"<br/>Return total cost of products<br/>Return "Payment is not complete"<br/>Return itemized receipt |
