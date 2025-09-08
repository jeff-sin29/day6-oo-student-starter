package oo.step2;

import oo.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTest {

    // when introduce a student, then return a message with name and age
    @Test
    void should_introduce_self_when_introduce_given_a_student(){
        Student student = new Student(1, "Tom", 18);
        assertEquals("My name is Tom. I am 18 years old. I am a student.", student.introduce());
    }

    // when equals two same id student then return true
    @Test
    void should_return_true_when_Equals_given_same_id(){
        Student student1 = new Student(1, "Tom", 18);
        Student student2 = new Student(1, "Tom", 19);

        assertEquals(student1, student2);
    }

    // when equals two different id student then return true
}
