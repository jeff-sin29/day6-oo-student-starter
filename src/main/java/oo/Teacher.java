package oo;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person{
    private List<Klass> classes = new ArrayList<>();

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public String introduce(){
        StringBuilder introduceMsg = new StringBuilder();
        introduceMsg.append(super.introduce() + " I am a teacher.");
        if (!classes.isEmpty()) {
            introduceMsg.append(" I teach Class");
            for (Klass klass : classes) {
                introduceMsg.append(" " + klass.getNumber());
                if (klass != classes.get(classes.size() - 1)) {
                    introduceMsg.append(",");
                }

            }
            return introduceMsg.toString() + ".";
        }
        return introduceMsg.toString();
    }

    public void assignTo(Klass klass) {
        if (!classes.contains(klass)) {
            classes.add(klass);
        }
    }

    public boolean belongsTo(Klass klass) {
        return classes.contains(klass);
    }

    public boolean isTeaching(Student student) {
        for (Klass klass : classes) {
            if (student.isIn(klass)) {
                return true;
            }
        }
        return false;
    }
}
