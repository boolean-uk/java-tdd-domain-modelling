# Example Domain Model

## User Story

```
As a supermarket shopper,
So that I can pay for products at checkout,
I'd like to be able to know the total cost of items in my basket.
```

```
As an organised individual,
So that I can evaluate my shopping habits,
I'd like to see an itemised receipt that includes the name and price of the products
I bought as well as the quantity, and a total cost of my basket.
```

## Domain Model

| Class            | Attributes                                   | Methods                                           | Scenario                                        | Results                                                     |
|------------------|---------------------------------------------|---------------------------------------------------|-------------------------------------------------|--------------------------------------------------------------|
| Shopper          | - basket: List\<Product>                    | - addToBasket(product: Product)                   | A shopper adds products to their basket.       | Product is added to the basket.                              |
|                  |                                             | - getBasketTotalCost(): double                   | A shopper wants to know the total cost.        | The total cost of the basket is calculated and returned.     |
|                  |                                             | - generateReceipt(): Receipt                     | A shopper wants to see an itemized receipt.     | An itemized receipt is generated and returned.               |
| Product          | - name: String                               | - getPrice(): double                             | A shopper needs to know the price of a product.| The price of the product is retrieved.                     |
|                  | - price: double                              |                                                 |                                                 |                                                              |
| Receipt          | - items: List\<ReceiptItem>                  | - addItem(item: ReceiptItem)                    | Items are added to the receipt.                | Item is added to the receipt.                               |
|                  |                                             | - calculateTotalCost(): double                  | A shopper wants to calculate the total cost.   | The total cost of the receipt is calculated and returned.   |
| ReceiptItem      | - product: Product                          |                                                 |                                                 |                                                              |
|                  | - quantity: int                             |                                                 |                                                 |                                                              |
|                  |                                             |                                                 |                                                 |                                                              |
