package oo.step1;

import oo.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {


    // when introduce a person, then return a message with name and age
    @Test
    void should_self_introduce_when_introduce_given_a_person(){
        Person person = new Person(1, "Tom", 18);
        assertEquals("My name is Tom. I am 18 years old.", person.introduce());
    }

    // when equals two same id person then return true
    @Test
    void should_return_true_when_isSamePerson_given_same_id(){
        Person person = new Person(1, "Tom", 18);
        Person person1 = new Person(1, "Tom", 19);

        assertTrue(person.isSamePerson(person1));
    }

    // when equals two different id person then return true

}
