package ru.itsjava.coffeeproject.services;

import ru.itsjava.coffeeproject.domain.Coffee;

public interface CoffeeService {
    Coffee getCoffeeByPrice(double price);
}
