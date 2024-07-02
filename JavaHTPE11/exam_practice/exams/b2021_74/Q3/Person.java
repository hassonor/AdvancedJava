package JavaHTPE11.exam_practice.exams.b2021_74.Q3;

public class Person implements Copyable<Person>{
    private String name;
    private int age;

	public Person(String name, int age){
        this.name = name;
        this.age = age;
    }


    @Override
    public Person copy() throws CloneNotSupportedException{
        return new Person(name,age);
    }
}
