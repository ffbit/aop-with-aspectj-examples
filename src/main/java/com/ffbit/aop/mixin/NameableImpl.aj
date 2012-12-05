package com.ffbit.aop.mixin;

public aspect NameableImpl {
    private String Nameable.name;

    public void Nameable.setName(String name) {
        this.name = name;
    }

    public String Nameable.getName() {
        return this.name;
    }

}
