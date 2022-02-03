package ru.itsjava.coffeeproject.services;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CoffeeHouseImpl implements CoffeeHouse{
    private final CoffeeService coffeeService;
    private final IOService ioService;

    @Override
    public void hiToNewCustomer() {

        System.out.println("Hello! Our Coffee House menu: Espresso - 100.0 rub, Cappuccino - 200.0 rub");
        System.out.println("Enter a price:");
        String price = ioService.input();
        double convertPrice = Double.parseDouble(price);
        System.out.println(price + " has paid, we're preparing your coffee...");
        System.out.println("Your " + coffeeService.getCoffeeByPrice(convertPrice) + " is ready! Have a nice day");


    }
}
