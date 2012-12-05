package com.ffbit.aop.error;

public aspect DoNotUseSystemOutAspect {

    declare error: get(* System.out):
        "Do not use System.out directly. Use some logger instead.";

}
