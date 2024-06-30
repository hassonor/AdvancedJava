package JavaHTPE11.exam_practice.exams.a2023_88.Q1.part2;

public class Main {
    public static void main(String[] args) {
        TypeB obj = new TypeB() {
            @Override
            public void actionB() {
                System.out.println("actionB");
            }

            @Override
            public void actionA() {
                System.out.println("actionA");
            }

            @Override
            public void action() throws Exception {
                System.out.println("action");
            }
        };

        try {
            work(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void work(TypeA obj) throws Exception {
        obj.action();
        obj.actionA();
        if (obj instanceof TypeB) {
            ((TypeB) obj).actionB();
        }

    }
}
