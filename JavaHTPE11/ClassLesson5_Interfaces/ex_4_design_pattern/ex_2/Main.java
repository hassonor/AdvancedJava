package JavaHTPE11.ClassLesson5_Interfaces.ex_4_design_pattern.ex_2;

public class Main {
    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        for (int i = 0; i < 10; i++)
            sequence.add(Integer.toString(i));


        Selector selector = sequence.getSelector();
        while (!selector.end()) {
            System.out.println(selector.current());
            selector.next();
//	    

        }
    }
}
