package com.example.order.app;


import com.example.order.Pricing;


public class Main {
public static void main(String[] args) {
double price = 100.0;
double discounted = Pricing.applyDiscount(price, 12.5);
System.out.println("Discounted: " + discounted);
}
}