package oo.step3;

import oo.Klass;
import oo.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

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

    // when introduce a student is in a class then return message with name age and class

}
