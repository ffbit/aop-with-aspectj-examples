package com.ffbit.aop;

public aspect HelloWorldAspect {
    pointcut main() : execution(void HelloWorld..main(String...));

    before(): main() {
        System.out.println("Before");
    }

    after(): main() {
        System.out.println("After");
    }

}
