package oo.step5;

import oo.Klass;
import oo.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KlassTest {

    private ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    public void setup(){
        System.setOut(new PrintStream(outContent));
    }

    // when assign leader given student is not in class then print prompt message
    @Test
    void should_print_message_when_assignLeader_given_student_not_in_class(){
        Klass klass = new Klass(1);
        Student student = new Student(1, "Tom", 18);
        klass.assignLeader(student);
        assertEquals("It is not one of us.\r\n", outContent.toString());
    }

}
