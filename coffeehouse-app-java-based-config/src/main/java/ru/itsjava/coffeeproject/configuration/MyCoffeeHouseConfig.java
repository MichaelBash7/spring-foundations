package ru.itsjava.coffeeproject.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.itsjava.coffeeproject.services.*;


@Configuration
public class MyCoffeeHouseConfig {

    @Bean
    public CoffeeService coffeeService(){
        return new CoffeeServiceImpl();
    }
    @Bean
    public IOService ioService(){
        return new IOServiceImpl();
    }
    @Bean
    public CoffeeHouse coffeeHouse (CoffeeService coffeeService, IOService ioService){
        return new CoffeeHouseImpl(coffeeService, ioService);
    }
}
