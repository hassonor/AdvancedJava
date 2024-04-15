package JavaHTPE11.ClassLesson5_Interfaces.ex_4_design_pattern.ex_2;

interface Selector {
    boolean end();

    Object current();

    Object head();

    void next();
}