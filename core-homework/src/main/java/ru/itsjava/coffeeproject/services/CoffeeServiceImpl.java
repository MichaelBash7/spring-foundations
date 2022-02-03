package ru.itsjava.coffeeproject.services;

import lombok.RequiredArgsConstructor;
import ru.itsjava.coffeeproject.domain.Coffee;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CoffeeServiceImpl implements CoffeeService{


    @Override
    public Coffee getCoffeeByPrice(double price) {
        if (price == 100.0) {
            return new Coffee("Espresso");
        } else if (price == 200.0) {
            return new Coffee("Cappuccino");
        }
        return null;
    }
}
