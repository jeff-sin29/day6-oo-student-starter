package oo;

import java.util.Objects;

public class Klass {
    int number;
    Student leader;

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Klass klass = (Klass) o;
        return number == klass.number;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(number);
    }

    public void assignLeader(Student student) {
        if (!student.isIn(this)) {
            System.out.println("It is not one of us.");
            return;
        }
        this.leader = student;
    }
}
