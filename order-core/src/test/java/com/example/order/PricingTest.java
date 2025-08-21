package com.example.order;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class PricingTest {
@Test
void discountWorks() {
assertEquals(90.0, Pricing.applyDiscount(100.0, 10.0), 1e-9);
}
}