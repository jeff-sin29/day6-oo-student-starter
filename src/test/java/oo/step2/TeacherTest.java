package oo.step2;

import oo.Student;
import oo.Teacher;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TeacherTest {

    // when introduce a teacher, then return a message with name and age
    @Test
    void should_introduce_self_when_introduce_given_a_teacher(){
        Teacher teacher = new Teacher(1, "Jerry", 21);
        assertEquals("My name is Jerry. I am 21 years old. I am a teacher.", teacher.introduce());
    }
    // when equals two same id teacher then return true
    @Test
    void should_return_true_when_Equals_given_same_id(){
        Teacher teacher1 = new Teacher(1, "Tom", 18);
        Teacher teacher2 = new Teacher(1, "Tom", 19);

        assertEquals(teacher1, teacher2);
    }

    // when equals two different id teacher then return true
}
