package JavaHTPE11.exam_practice.exams.a2019_95.Q1.B;

public class Main {
    public static void main(String[] args) {
        Listener myAdapter = new Adapter1() {
            @Override
            public void action() {
                System.out.println("action()");
            }

            @Override
            public void actionA() throws Exception {
                System.out.println("actionA()");
            }


        };
    }

    public static void performAction(Listener obj) {
        obj.action();
        if (obj instanceof Adapter1) {
            try {
                ((Adapter1) obj).actionA();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        if (obj instanceof Adapter2) {
            ((Adapter2) obj).actionB();
            ((Adapter2) obj).actionC();
        }

    }
}
