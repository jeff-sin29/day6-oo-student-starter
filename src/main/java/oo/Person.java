package oo;

public class Person {
    private final int id;
    private final String name;
    private final int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String introduce(){
        return "My name is %s. I am %d years old.".formatted(name, age);
    }

    public boolean isSamePerson(Person person1){
        return this.id == person1.id;
    }
}
