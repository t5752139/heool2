package it.cast.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component("myAspenct")
@Aspect
public class MyAspect {

    //前置
    @Before("poinct()")
    public void befoce(){

        System.out.println("前置....");
    }
    @Pointcut("execution(void it.cast.aop.Target.save())")
    public void poinct(){}
}
