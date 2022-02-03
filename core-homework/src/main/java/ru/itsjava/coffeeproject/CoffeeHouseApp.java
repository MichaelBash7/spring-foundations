package ru.itsjava.coffeeproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.itsjava.coffeeproject.services.CoffeeHouse;

public class CoffeeHouseApp {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

        CoffeeHouse coffeeHouse = context.getBean("coffeeHouse", CoffeeHouse.class);
        coffeeHouse.hiToNewCustomer();

    }
}
