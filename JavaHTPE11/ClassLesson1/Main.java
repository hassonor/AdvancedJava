package JavaHTPE11.ClassLesson1;

public class Main {

    public static void main(String[] args) {
//		Student s = new Student();
//		s._val = 99;
////		System.out.println(s._val/0);
//		System.out.println(s._val) ;
//		for (int i = 0; i < 10; i++) {
//			for (int j = 0; j < 10; j++) {
//				System.out.print(i*j+"\t");
//			}
//			System.out.println();
//			
//		}
        ////////////////////////////////////////
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
//		//EX 02
// 		String stt = "123";
// 		System.out.println(stt.valueOf(321));
//		System.out.println("1234".valueOf(321));
//		System.out.println(String.valueOf(321));
//
    }

}
