package demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* demo.ShoppingCart.checkOut(..))")
    public void beforeLogger(JoinPoint joinPoint) {
//        System.out.println(joinPoint.getSignature());
        System.out.println(joinPoint.getArgs()[0].toString());
        System.out.println("Before Loggers");
    }

    @After("execution(* *.*.checkOut(..))")
    public void afterLogger() {
        System.out.println("After Loggers");
    }

    @Pointcut("execution(* demo.ShoppingCart.quantity(..))")
    public void afterReturningPointCut() {
    }

    @AfterReturning(pointcut = "afterReturningPointCut()", returning = "retVal")
    public void afterReturning(String retVal){
        System.out.println("After returning: " + retVal);
    }
}
