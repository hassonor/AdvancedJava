package JavaHTPE11.exam_practice.exams.a2023_88.Q1.part1;

class A {
    protected int num;

    public A(int n) throws Exception {
        num = n;
        if (n >= 0) System.out.println("A" + num);
        else throw new Exception();

    }
}
