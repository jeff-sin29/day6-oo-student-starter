package oo.step3;

import oo.Klass;
import oo.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    // when student not join klass and isIn klass then return false
    @Test
    void should_return_false_when_isIn_given_student_not_join_klass(){
        //TODO
        Student student = new Student(1, "Tom", 18);
        assertFalse(student.isIn(new Klass(2)));
    }

    // when student join klass and isIn klass then return true
    @Test
    void should_return_true_when_isIn_given_student_joined_klass(){
        //TODO
        Student student = new Student(1, "Tom", 18);
        Klass klass = new Klass(2);
        student.join(klass);
        assertTrue(student.isIn(klass));
    }

    // when student join two klass then return recently klass
    @Test
    void should_return_correct_klass_when_getKlass_given_student_joined_two_klass() {
        //TODO
        Student student = new Student(1, "Tom", 18);
        Klass klass1 = new Klass(2);
        Klass klass2 = new Klass(3);
        student.join(klass1);
        student.join(klass2);
        assertTrue(student.isIn(klass2));
    }

    // when introduce a student is in a class then return message with name age and class
    @Test
    void should_introduce_when_introduce_given_student_joined_klass() {
        //TODO
        Student student = new Student(1, "Tom", 18);
        Klass klass = new Klass(2);
        student.join(klass);
        assertEquals("My name is Tom. I am 18 years old. I am a student. I am in class 2.", student.introduce());
    }
}
