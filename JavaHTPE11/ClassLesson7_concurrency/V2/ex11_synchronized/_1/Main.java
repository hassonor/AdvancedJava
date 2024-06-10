package JavaHTPE11.ClassLesson7_concurrency.V2.ex11_synchronized._1;

public class Main {

    public static void main(String[] args) {
        SynchZebra zeb = new SynchZebra();
        SynchCamel cam = new SynchCamel();

        zeb.start();
        cam.start();
    }

}
