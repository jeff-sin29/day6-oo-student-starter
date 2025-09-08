package oo;

public class Student extends Person{
    public Student(int id, String name, int age) {
        super(id, name, age);
    }

    public String introduce(){
        return "My name is %s. I am %d years old. I am a student.".formatted(getName(), getAge());
    }

}
