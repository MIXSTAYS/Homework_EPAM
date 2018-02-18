package test.java.employeeLab.model;

import main.java.employeeLab.model.Person;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    @Test
    public void toStringshouldReturnNameAndSurname(){
        Person person = new Person("John","Doe");
        assertEquals("John Doe",person.toString());
    }
}
