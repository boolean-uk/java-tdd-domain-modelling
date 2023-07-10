package com.booleanuk.core.shop;

import org.junit.jupiter.api.*;

import java.math.BigDecimal;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class BasketTest {
    private static Basket BASKET;
    private static Product MILK;
    private static Product BREAD;

    @BeforeAll
    static void testSetup() {
        BASKET = new Basket();
        MILK = new Product("milk", BigDecimal.valueOf(7));
        BREAD = new Product("bread", BigDecimal.valueOf(6));
    }

    @AfterEach
    void resetBasket() {
        BASKET.clear();
    }

    @Nested
    class AddProduct {
        @Test
        void shouldNotAddProductToBasketAndReturnTrueIfPresent () {
            BASKET.addProduct(MILK);

            assertTrue(BASKET.addProduct(MILK));
        }

        @Test
        void shouldAddProductToBasketAndReturnFalseIfNotPresent () {
            assertFalse(BASKET.addProduct(BREAD));
        }
    }

    @Nested
    class RemoveProduct {
        @Test
        void shouldRemoveProductFromBasketWhenPresent () {
            BASKET.addProduct(MILK);

            BASKET.removeProduct(MILK.name());

            assertFalse(BASKET.getProducts().contains(MILK));
        }

        @Test
        void shouldNotRemoveProductFromBasketWhenNotPresent () {
            BASKET.addProduct(MILK);

            BASKET.removeProduct(BREAD.name());

            assertTrue(BASKET.getProducts().contains(MILK));
        }
    }

    @Nested
    class Clear {
        @Test
        void shouldClearBasketIfNotEmpty () {
            BASKET.addProduct(MILK);
            BASKET.addProduct(BREAD);

            BASKET.clear();

            assertTrue(BASKET.getProducts().isEmpty());
        }

        @Test
        void shouldDoNothingWhenBasketEmpty () {
            BASKET.clear();

            assertTrue(BASKET.getProducts().isEmpty());
        }
    }

    @Nested
    class TotalCost {
        @Test
        void shouldReturn0ForEmptyBasket() {
            assertEquals(BigDecimal.ZERO, BASKET.totalCost());
        }

        @Test
        void shouldCalculateTotalCostForNonEmptyBasket() {
            BASKET.addProduct(MILK);
            BASKET.addProduct(BREAD);
            var expectedPrice = MILK.price().add(BREAD.price());

            assertEquals(expectedPrice, BASKET.totalCost());
        }
    }

    @Nested
    class Receipt {
        @Test
        void shouldGenerateCorrectReceiptForEmptyBasket() {
            var actualReceipt = BASKET.receipt();

            assertTrue(actualReceipt.products().isEmpty());
            assertEquals(BigDecimal.ZERO, actualReceipt.totalPrice());
        }

        @Test
        void shouldGenerateCorrectReceiptForNonEmptyBasket() {
            var expectedReceiptProducts = Map.of(
                MILK, 1,
                BREAD, 1
            );
            var expectedReceiptPrice = MILK.price().add(BREAD.price());
            BASKET.addProduct(MILK);
            BASKET.addProduct(BREAD);

            var actualReceipt = BASKET.receipt();

            assertFalse(actualReceipt.products().isEmpty());
            assertEquals(expectedReceiptProducts, actualReceipt.products());
            assertEquals(expectedReceiptPrice, actualReceipt.totalPrice());
        }
    }
}