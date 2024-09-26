package com.booleanuk.core.shop;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class ShopperTest {
    private static Product MILK;
    private static Product BREAD;

    @BeforeAll
    static void testSetup() {
        MILK = new Product("milk", BigDecimal.valueOf(7));
        BREAD = new Product("bread", BigDecimal.valueOf(6));
    }

    @Nested
    class Pay {
        @Test
        void shouldCorrectlyChangeBalanceWhenCanAffordBasket() {
            Shopper shopper = new Shopper(BigDecimal.valueOf(100));
            shopper.addToBasket(MILK);
            shopper.addToBasket(BREAD);
            BigDecimal expectedShopperBalance = shopper.getBalance().subtract(MILK.price().add(BREAD.price()));
            
            shopper.pay();

            assertEquals(expectedShopperBalance, shopper.getBalance());
        }

        @Test
        void shouldThrowWhenCannotAffordBasket() {
            var shopper = new Shopper(BigDecimal.ZERO);
            shopper.addToBasket(MILK);

            assertThrows(IllegalStateException.class, shopper::pay);
        }
    }
}