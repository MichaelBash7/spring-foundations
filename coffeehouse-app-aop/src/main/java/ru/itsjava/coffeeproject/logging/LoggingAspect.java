package ru.itsjava.coffeeproject.logging;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* ru.itsjava.coffeeproject.services.CoffeeHouse.*(..))")
    public void logBefore(JoinPoint joinPoint){
        System.out.println("Log Before " + joinPoint.getTarget().getClass().getSimpleName());
    }

    @After("execution(* ru.itsjava.coffeeproject.services.CoffeeHouse.*(..))")
    public void logAfter(JoinPoint joinPoint){
        System.out.println("Log After " + joinPoint.getTarget().getClass().getSimpleName());
    }

    @Around("execution(* ru.itsjava.coffeeproject.services.CoffeeHouse.*(..))")
    public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Log Around Before " + joinPoint.getTarget().getClass().getSimpleName());
        Object result = joinPoint.proceed();
        System.out.println("Log Around After " + joinPoint.getTarget().getClass().getSimpleName());
        return result;
    }
}
