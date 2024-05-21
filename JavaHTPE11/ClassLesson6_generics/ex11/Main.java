package JavaHTPE11.ClassLesson6_generics.ex11;

class Calculator<T extends Number> {
    T[] nums;

    Calculator(T[] o) {
        nums = o;
    }

    double average() {
        double sum = 0.0;
        for (int i = 0; i < nums.length; i++)
            sum += nums[i].doubleValue();
        return sum / nums.length;
    }
    //#1+2
//  boolean sameAvg(Calculator<Integer> ob) {
//    if (average() == ob.average())
//      return true;
//    return false;
//  }

    //#3
//  boolean sameAvg(Calculator<T> ob) {
//	  if (average() == ob.average())
//		  return true;
//	  return false;
//	 }
    //#4
//    boolean sameAvg(Calculator<?> ob) {
//        if (average() == ob.average())
//            return true;
//        return false;
//    }
    //#5
    boolean sameAvg(Calculator<? extends Number> ob) {
        return average() == ob.average();
    }

}


public class Main {
    public static void main(String args[]) {
        Integer inums[] = {1, 2, 3, 4, 5};
        Calculator<Integer> iob = new Calculator<Integer>(inums);
        System.out.println("Integer array ==> average : " + iob.average());
        Double[] dnums = {1.1, 2.2, 3.3, 4.4, 5.5};
        Calculator<Double> dob = new Calculator<Double>(dnums);
        System.out.println("Integer Double ==> average : " + dob.average());
        //#1
//    if (iob.sameAvg(dob))
//      System.out.println("are the same.");
//    else
//      System.out.println("differ.");
        //#2
        if (dob.sameAvg(iob))
            System.out.println("are the same.");
        else
            System.out.println("differ.");
    }

}
  