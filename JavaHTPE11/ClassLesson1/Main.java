package JavaHTPE11.ClassLesson1;

public class Main {

    public static void main(String[] args) {
        Student1 s1 = new Student1();
        Student1 s2 = new Student1("Or", "Hasson", 'M', 100.0);
        System.out.println(s2);

        // EX 01 ....
        System.out.println(Student.get_counter());
        Student st = new Student();
        st.set_name("Roy");
        System.out.println(st.get_counter());
        Student st1 = new Student();
        System.out.println(Student.get_counter());

        System.out.println(Student.get_counter());

    }

}
