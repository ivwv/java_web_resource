package demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
//@Aspect
public class SingerAspect {
    @Before("execution(String demo.Singer.song(String))")
    public void before(JoinPoint point){
        System.out.println("--before"+point.getArgs()[0]);
    }

    @AfterReturning(value = "execution(* demo.Singer.song(..))",returning = "obj")
    public void afterreturing(Object obj){
        System.out.println("---afterreturning:"+obj);
    }

    @After("execution(* demo.Singer.song(..))")
    public void after(){
        System.out.println("----after");
    }

    @AfterThrowing(value = "execution(* demo.Singer.song(..))",throwing = "e")
    public void afterThrowing(Throwable e){
        System.out.println("---after throwing:"+e.getMessage());
    }
}
