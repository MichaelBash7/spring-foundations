package ru.itsjava.coffeeproject.services;


import org.springframework.stereotype.Service;
import ru.itsjava.coffeeproject.domain.Coffee;

@Service
public class CoffeeServiceImpl implements CoffeeService{

    @Override
    public Coffee getCoffeeByPrice(double price) {
        if (price == 100.0) {
            return new Coffee("Espresso");
        } else if (price == 200.0) {
            return new Coffee("Cappuccino");
        }
        throw new RuntimeException("Coffee haven't found");
    }
}
