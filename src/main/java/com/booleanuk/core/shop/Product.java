package com.booleanuk.core.shop;

import java.math.BigDecimal;

public record Product(
        String name,
        BigDecimal price
) {
}
