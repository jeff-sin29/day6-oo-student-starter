package oo.step2;

import oo.Person;
import oo.Student;
import oo.Teacher;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {

    // when introduce a person of student then return message with name and age
    @Test
    void should_introduce_self_when_introduce_given_a_person_of_student(){
        Person person = new Student(1, "Tom", 18);
        assertEquals("My name is Tom. I am 18 years old. I am a student.", person.introduce());
    }
    // when introduce a person of teacher then return message with name and age
    void should_introduce_self_when_introduce_given_a_person_of_teacher(){
        Person person = new Teacher(1, "Jerry", 21);
        assertEquals("My name is Tom. I am 18 years old. I am a teacher.", person.introduce());
    }

}
