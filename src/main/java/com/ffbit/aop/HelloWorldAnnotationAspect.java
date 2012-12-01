package com.ffbit.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class HelloWorldAnnotationAspect {

    @Pointcut("execution(void com.ffbit.aop.HelloWorldAnnotation..main(String...))")
    public void main() {
    }

    @Around("main()")
    public Object aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Around start");
        Object result = joinPoint.proceed();
        System.out.println("Around end");

        return result;
    }

}
