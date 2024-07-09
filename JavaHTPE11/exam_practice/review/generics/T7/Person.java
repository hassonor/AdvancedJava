package JavaHTPE11.exam_practice.review.generics.T7;

public class Person implements Copyable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public Person copy() throws CopyException {
        Person p = new Person(name, age);
        return p;
    }

}

