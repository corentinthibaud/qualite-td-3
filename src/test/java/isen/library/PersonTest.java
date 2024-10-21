package isen.library;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    @Test
    public void testPerson() {
        Person person = new Person();
        assertEquals("unknown", person.getName());
        assertEquals(0, person.getYears());
    }

    @Test
    public void setAndGetName() {
        Person person = new Person();
        person.setName("John");
        assertEquals("John", person.getName());
    }

    @Test
    public void setAndGetYears() {
        Person person = new Person();
        person.setYears(25);
        assertEquals(25, person.getYears());
    }

}