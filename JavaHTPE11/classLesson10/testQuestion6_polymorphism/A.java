package JavaHTPE11.classLesson10.testQuestion6_polymorphism;

public class A {
    private int num =0;
    public A(int num){
        this.num = num;
    }


    @Override
    public boolean equals(Object obj){
        System.out.println("111");
        num++;
        A a = (A)obj;
        return a.num == num;
    }

    public boolean equals(A a){
        System.out.println("222");
        return super.equals(a);
    }
}
