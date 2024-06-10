package JavaHTPE11.ClassLesson2_oop_polymorphism;

public class Main {


    public static void main(String[] args) {
        //		// EX 01 ....
        System.out.println(Student.get_counter());
        Student st = new Student();
        st.set_name("Roy");
        System.out.println(st.get_counter());
        Student st1 = new Student();
        System.out.println(Student.get_counter());
        MathStudent st2 = new MathStudent();
        System.out.println(Student.get_counter());
        //EX 02
        String stt = "123";
        System.out.println(stt.valueOf(321));
        System.out.println("1234".valueOf(321));
        System.out.println(String.valueOf(321));


        String s = "343434";
        int[] arr = {22, 33, 44, 55, 66, 8, -3, 0};
        System.out.println(s.charAt(5));
        String stam = String.valueOf(3.3333);

//		System.out.println(s.valueOf(s));
        System.out.println(String.valueOf(s));
        //arr.length.....
        //Boolean
        String stam1 = "stam";


    }

}
