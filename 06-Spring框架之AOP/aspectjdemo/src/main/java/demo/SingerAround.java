package demo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class SingerAround {

    public void before(ProceedingJoinPoint point){
        System.out.println("----bfore---"+point.getArgs()[0]);
    }

    @Around(value = "execution(* demo.Singer.song(..))")
    public void around(ProceedingJoinPoint point){
        this.before(point);
//        System.out.println("--before:"+point.getArgs()[0]);
        Object obj=null;
        try {
            obj=point.proceed();
            System.out.println("---after");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            System.out.println("---throw:"+throwable.getMessage());
        }
        System.out.println("---finally:"+obj);
    }
}
