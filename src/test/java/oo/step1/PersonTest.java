package oo.step1;

import oo.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {


    // when introduce a person, then return a message with name and age
    @Test
    void should_self_introduce_when_introduce_given_a_person(){
        Person person = new Person(1, "Tom", 18);
        assertEquals("My name is Tom. I am 18 years old.", person.introduce());
    }

    // when equals two same id person then return true
    @Test
    void should_return_true_when_Equals_given_same_id(){
        Person person1 = new Person(1, "Tom", 18);
        Person person2 = new Person(1, "Tom", 19);

        assertEquals(person1, person2);
    }

    // when equals two different id person then return false
    @Test
    void should_return_false_when_Equals_given_different_id(){
        Person person1 = new Person(1, "Tom", 18);
        Person person2 = new Person(2, "Tom", 16);

        assertNotEquals(person1, person2);
    }

}
