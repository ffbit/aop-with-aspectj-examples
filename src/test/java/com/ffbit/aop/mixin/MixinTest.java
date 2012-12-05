package com.ffbit.aop.mixin;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MixinTest {

    private Person person;

    @Before
    public void setUp() throws Exception {
        person = new Person();
    }

    @Test
    public void testName() throws Exception {
        person.setName("John");

        assertThat(person.getName(), is("John"));
    }

}
