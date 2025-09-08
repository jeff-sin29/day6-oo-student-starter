package oo;

public class Teacher extends Person{
    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public String introduce(){
        return "My name is %s. I am %d years old. I am a teacher.".formatted(getName(), getAge());
    }
}
