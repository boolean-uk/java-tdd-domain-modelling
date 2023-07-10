# User story 1

"As a supermarket shopper,
So that I can pay for products at checkout,
I'd like to be able to know the total cost of items in my basket."

As a supermarket shopper, so that I can pay for products at checkout, I'd like to ba able to know the total cost of items in my basket.

| Classes/Components | Methods             | Scenario                                                                                 | Output |
|--------------------|---------------------|------------------------------------------------------------------------------------------|--------|
| ShoppingCart       | calclateTotalCost() | 1. The user adds products to their shopping cart.                                        | 'void '  |
|                    |                     | 2. The calculateTotalCost method is called.                                              |        |
|                    |                     | 3. The ShoppingCart retrieves the list of products in the cart.                          |        |
|                    |                     | 4. It calculates the total cost by summing up the prices of all the products in the cart |        |
|                    |                     | 5. The total cost is returned to the user interface for display.                         |'BigDecimal' representing the total cost        |
| Product            |                     | -Properties: name(String), price(decimal), quanity (int),...                             |        |
