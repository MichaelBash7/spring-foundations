package ru.itsjava.coffeeproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import ru.itsjava.coffeeproject.services.CoffeeHouse;

@EnableAspectJAutoProxy
@ComponentScan("ru.itsjava.coffeeproject")
public class CoffeeHouseApp {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(CoffeeHouseApp.class);

        CoffeeHouse coffeeHouse = context.getBean("coffeeHouse", CoffeeHouse.class);
        coffeeHouse.hiToNewCustomer();

    }
}
