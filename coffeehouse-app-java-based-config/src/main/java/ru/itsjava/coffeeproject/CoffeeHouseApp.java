package ru.itsjava.coffeeproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import ru.itsjava.coffeeproject.services.CoffeeHouse;

@ComponentScan("ru.itsjava.coffeeproject.configuration")
public class CoffeeHouseApp {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(CoffeeHouseApp.class);

        CoffeeHouse coffeeHouse = context.getBean("coffeeHouse", CoffeeHouse.class);
        coffeeHouse.hiToNewCustomer();

    }
}
