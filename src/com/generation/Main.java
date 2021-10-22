package com.generation;

import com.generation.uber.UberDriver;

public class Main {

    public static void main(String[] args) {

        UberDriver driver = new UberDriver();
        UberDriverBlack driverBlack = new UberDriverBlack();

        System.out.println("Uber");
        System.out.println(driver.calculatePrice(6));

        System.out.println("Uber black");
        System.out.println(driverBlack.calculatePrice(6));

    }
}