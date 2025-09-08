package oo.step4;

import oo.Klass;
import oo.Teacher;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TeacherTest {

    // when belongsTo give teacher does not teach the class then return false
    @Test
    void should_return_false_when_belongsTo_given_teacher_does_not_teach_the_class(){
        //TODO
        Klass klass1 = new Klass(2);
        Teacher teacher = new Teacher(1, "Tom", 21);
        teacher.assignTo(new Klass(3));
        assertFalse(teacher.belongsTo(klass1));
    }

    // when belongsTo give teacher teach the class then return true
    @Test
    void should_return_true_when_belongsTo_given_teacher_teach_the_class(){
        //TODO
        Klass klass1 = new Klass(2);
        Teacher teacher = new Teacher(1, "Tom", 21);
        teacher.assignTo(klass1);
        assertTrue(teacher.belongsTo(klass1));
    }

    // when belongsTo given teacher teach multiple classes then return true
    @Test
    void should_return_true_when_belongsTo_given_teacher_does_not_teach_multiple_classes(){
        //TODO
        Klass klass1 = new Klass(1);
        Klass klass2 = new Klass(2);
        Teacher teacher = new Teacher(1, "Tom", 21);
        teacher.assignTo(klass1);
        teacher.assignTo(klass2);
        assertTrue(teacher.belongsTo(klass1));
        assertTrue(teacher.belongsTo(klass2));
    }

    //when introduce given teacher teach one class then return message
    

    // when introduce given teacher teach multiple classes then return message

    // when isTeaching given student not in the class taught by teacher then should return false

    // when isTeaching given student in the class taught by teacher then return true

    // when isTeaching given student in any class taught by teacher then return true
}
