package oo;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person{
    private List<Klass> classes = new ArrayList<>();

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public String introduce(){
        return "My name is %s. I am %d years old. I am a teacher.".formatted(getName(), getAge());
    }

    public void assignTo(Klass klass) {
        if (!classes.contains(klass)) {
            classes.add(klass);
        }
    }

    public boolean belongsTo(Klass klass) {
        return classes.contains(klass);
    }
}
