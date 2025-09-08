package oo;

public class Student extends Person{
    private Klass klass;
    public Student(int id, String name, int age) {
        super(id, name, age);
    }

    public String introduce(){
        return "My name is %s. I am %d years old. I am a student.".formatted(getName(), getAge());
    }

    public boolean isIn(Klass klass) {
        return this.klass != null && this.klass.equals(klass);
    }

    public void join(Klass klass) {
        this.klass = klass;
    }
}
