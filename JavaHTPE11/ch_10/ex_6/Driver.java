package JavaHTPE11.ch_10.ex_6;

public class Driver {

    public static void main(String[] args) {

        /** Pointers
         * Compilation error/ Runtime error / OK */

        /**1*/
        //GrandFather f1 = new GrandFather(3);
        /**2*/
        //Son s1 = new Son(1, 2);
        /**3*/
        //GrandFather f1 = new Son(3, 4);
        /**4*/
        //Son s1 = new GrandFather(7);
        /**5*/
        //Father f1 = new GrandFather(7);
        /**6*/
        //GrandSon s1 = new Son(1, 2);
        /**7*
         //Son s1 = new GrandSon(0, 0, 0);
         /**8*/
        //GrandSon g1 = new Father(0, 0);
        /**9*/
        //GrandSon g1 = new Son(1, 2);
        /**10*/
        //Father f1 = new GrandSon(7,0,0);
        /**11*/
        //Father f1 = new Daughter(0, 0);
        /**12*/
        //Daughter d1 = new Son(0, 0);
        /**13*/
        //Son s1 = new Daughter(0, 0);

        /** Casting
         * Compilation error/ Runtime error / OK*/

        /**1*/
        //GrandFather f1 = new GrandFather(3);
        //Son s1 = f1;
        /**2*/
        //GrandFather f1 = new GrandFather(3);
        //Son s1 = (Son)f1;
        /**3*/
        //Object o = new Object();
        //Son s1 = o;
        /**4*/
        //GrandSon g1 = new GrandSon(7,0,0);
        //Father f1 = g1;
        /**5*/
        //Son s1 = new Son(2,1);
        //GrandSon g1 = (GrandSon)s1;
        /**6*/
        //Object o = new Object();
        //GrandFather g1 = (GrandFather)o;
        /**7*/
        //Son s1 = new Son(2,1);
        //GrandSon g1 = s1;
        /**8*/
        //GrandSon g1 = new GrandSon(7,0,0);
        //Father f1 = (Father)g1;
        /**9*/
        //GrandSon g1 = new GrandSon(7,0,0);
        //GrandFather g2 = (Father)g1;
        /**10*/
        //Father f1 = (Father)(new Son(2,2));
        /**11*/
        //Father f1 = (GrandSon)(new Son(2,2));
        /**12*/
        //Father f1 = (GrandFather)(new Son(2,2));
        /**13*/
        //Father f1 = null;
        //GrandSon g1 = (GrandSon)f1;
        /**14*/
        //Father f1 = null;
        //GrandFather g1 = (GrandFather)f1;
        /**15*/
        //GrandFather f1 = new GrandFather(3);
        //Object o = f1;
        /**16*/
        //Son s1 = new GrandSon(7,0,0);
        //Object o = s1;
        /**17*/
        //Father f1 = new Father(7,8);
        //Object o = (Object)f1;
        /**18*/
        //Father f1 = new Father(7,8);
        //Object o = (Son)f1;
        /**19*/
        //Son s1 = new Son(1,2);
        //Father f1 = s1;
        /**20*/
        //Son s1 = new Son(1,2);
        //GrandSon g1 = s1;
        /**21*/
        //Son s1 = new Son(1,2);
        //Father f1 = (Father)s1;
        /**22*/
        //Daughter d1 = new Daughter(1, 2);
        //Son s1 = (Son)d1;
        /**23*/
        //Daughter d1 = new Daughter(1, 2);
        //Son s1 = d1;
        /**24*/
        //GrandFather gf1 = new Daughter(2, 2);
        //Daughter d1 = gf1;
        /**25*/
        //GrandFather gf1 = new Daughter(2, 2);
        //Daughter d1 = (Daughter)gf1;
        /**26*/
        //Son s1 = new GrandSon(1, 1, 1);
        //Daughter d1 = (Daughter)s1;

        /** Equals
         * Runtime error / what will be printed? */

        /**1*/
        //Son s1 = new Son(1, 2);
        //GrandFather f1 = new GrandFather(3);
        //s1.equals(f1);
        /**2*/
        //Son s1 = new Son(1, 2);
        //GrandFather f1 = new GrandFather(3);
        //f1.equals(s1);
        /**3*/
        //Son s1 = new Son(1, 2);
        //Object o = new Object();
        //s1.equals(o);
        /**4*/
        //Son s1 = new Son(1, 2);
        //Object o = new Object();
        //o.equals(s1);
        /**5*/
        //Son s1 = new Son(1, 2);
        //Object o = s1;
        //s1.equals(o);
        /**6*/
        //Son s1 = new Son(1, 2);
        //Object o = s1;
        //o.equals(s1);
        /**7*/
        //Son s1 = new GrandSon(1, 2, 3);
        //Object o = s1;
        //s1.equals(o);
        /**8*/
        //Son s1 = new GrandSon(1, 2, 3);
        //GrandSon s2 = new GrandSon(1, 2, 3);
        //s1.equals(s2);
        /**9*/
        //GrandSon s1 = new GrandSon(1, 2, 3);
        //GrandSon s2 = new GrandSon(1, 2, 3);
        //s1.equals(s2);
        /**10*/
        //GrandSon s1 = new GrandSon(1, 1, 3);
        //GrandSon s2 = (GrandSon)(new Father(1,1));
        //s1.equals(s2);
        /**11*/
        //Son s1 = new GrandSon(1, 1, 3);
        //Son s2 = new GrandSon(1, 1, 3);
        //s1.equals(s2);
        /**12*/
        //Son s1 = new GrandSon(1, 1, 3);
        //Father f1 = new GrandSon(1, 1, 3);
        //s1.equals(f1);
        /**13*/
        //Son s1 = new GrandSon(1, 1, 3);
        //GrandSon g1 = new GrandSon(1, 1, 3);
        //s1.equals(g1);
        /**14*/
        //Father f1 = new GrandSon(1, 1, 3);
        //GrandSon g1 = new GrandSon(1, 1, 3);
        //f1.equals(g1);
        /**15*/
        //GrandSon gs1 = new GrandSon(1, 1, 3);
        //GrandSon g1 = new GrandSon(1, 1, 3);
        //gs1.equals(g1);
        /**16*/
        //GrandSon gs1 = new GrandSon(1, 1, 3);
        //Father f1 = new GrandSon(1, 1, 3);
        //gs1.equals(f1);
        /**17*/
        //GrandFather gf1 = new GrandSon(1, 1, 3);
        //Father f1 = new GrandSon(1, 1, 3);
        //gf1.equals(f1);
        /**18*/
        //GrandFather gf1 = new Father(1, 3);
        //Father f1 = new GrandSon(1, 1, 3);
        //gf1.equals(f1);
        /**19*/
        //GrandFather gf1 = new Father(1, 3);
        //GrandFather gf2 = new GrandSon(1, 1, 3);
        //gf1.equals(gf2);
        /**20*/
        //Object o = new GrandSon(2, 3, 4);
        //Father f = new Son(2,3);
        //o.equals(f);
        /**21*/
        //Object o = new GrandSon(2, 3, 4);
        //Father f = new Son(2,3);
        //o.equals(f);

        /** Foo
         * Compilation error/ Runtime error / what will be printed? */

        /**1*/
        //GrandFather gf1 = new GrandFather(1);
        //gf1.foo(2);
        /**2*/
        //GrandFather gf1 = new Father(1,2);
        //gf1.foo(2);
        /**3*/
        //GrandFather gf1 = new Father(1,2);
        //gf1.foo();
        /**4*/
        //Father f1 = new Father(1, 2);
        //f1.foo();
        /**5*/
        //Father f1 = new Father(1, 2);
        //f1.foo(2);
        /**6*/
        //Father f1 = new Father(1, 2);
        //f1.foo("Hi");
        /**7*/
        //Father f1 = new Son(1, 2);
        //f1.foo("Hi");
        /**8*/
        //Father f1 = new Son(1, 2);
        //f1.foo(1);
        /**9*/
        //Father f1 = new GrandSon(1, 2,3);
        //f1.foo(1);
        /**10*/
        //Father f1 = new GrandSon(1, 2,3);
        //f1.foo("Hi");
        /**11*/
        //Father f1 = new GrandSon(1, 2,3);
        //f1.foo(1,2);
        /**12*/
        //GrandSon gs1 = new GrandSon(1, 2,3);
        //gs1.foo(1,2);
        /**13*/
        //GrandSon gs1 = new GrandSon(1, 2,3);
        //gs1.foo(1);
        /**14*/
        //GrandSon gs1 = new GrandSon(1, 2,3);
        //gs1.foo("Hi");
        /**15*/
        //GrandSon gs1 = new GrandSon(1, 2,3);
        //gs1.foo();
        /**16*/
        //Son s1 = new Son(1,2);
        //s1.foo(1);
        /**17*/
        //Son s1 = new Son(1,2);
        //s1.foo("Hi");
        /**18*/
        //Son s1 = new GrandSon(1, 2,3);
        //s1.foo(1);
        /**19*/
        //Son s1 = new GrandSon(1, 2,3);
        //s1.foo();
        /**20*/
        //Son s1 = new GrandSon(1, 2,3);
        //s1.foo("Hi");

        /** Bar
         Compilation error/ Runtime error / what will be printed? */

        /**1*/
        //Father f1 = new Father(1, 2);
        //f1.bar();
        /**2*/
        //Father f1 = new GrandSon(1,2,3);
        //f1.bar(1,2);
        /**3*/
        //Son s1 = new Son(1,2);
        //s1.bar(0,0);
        /**4*/
        //Father f1 = new Son(1, 2);
        //f1.bar(2,2);
        /**5*/
        //Son s1 = new GrandSon(1, 2,3);
        //s1.bar(2,3);
        /**6*/
        //GrandSon g1 = new GrandSon(1, 1, 1);
        //g1.bar(0, 0);
        /**7*/
        //Father f1 = new Father(1, 2);
        //f1.bar(1,2);
        /**8*/
        //Daughter d1 = new Daughter(1, 2);
        //d1.bar(0, 0);
        /**9*/
        //Father f1 = new Daughter(1, 2);
        //f1.bar(0, 0);
    }
}
