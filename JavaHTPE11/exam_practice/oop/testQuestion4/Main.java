package JavaHTPE11.exam_practice.oop.testQuestion4;


public class Main{
    public static void main(String[] args){
        Pair p = new Pair(1,2);
        Pair p2 = null;

        try{
            p2 = (Pair)p.clone();
        }
        catch(CloneNotSupportedException e){
            e.printStackTrace();
        }

    }


}
