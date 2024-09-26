# Domain Model


```java
import java.math.BigDecimal;
import java.util.List;
import java.math.BigDecimal;

record Product (
    String name,
    BigDecimal price
) {}

record Receipt (
    Map<Product, Integer> productsWithQuantity,
    BigDecimal totalCost
) {}

class Basket {
    Receipt receipt;

    BigDecimal totalCost() {
        return receipt.totalCost();
    }
    
    Receipt receipt() {
        // ...
    }
}
```
