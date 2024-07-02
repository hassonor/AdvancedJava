package JavaHTPE11.exam_practice.exams.b2021_22.Q3;

import java.util.ArrayList;

public class Main   {

    public static void main(String[] args){
        ArrayList<Codeable> arr1 = new ArrayList<Codeable>(10);
        ArrayList<XXX> arr2 = new ArrayList<XXX>(10);

        arr1.add(new XXX());
        arr1.add(new YYY());
        arr2.add((XXX) arr1.get(0));
    }

    public static <T extends Codeable> T maxCode(ArrayList<T> arr){
        T maxItem = arr.get(0);

        for(T item: arr){
            if(item.code() > maxItem.code())
                maxItem = item;
        }

        return maxItem;

    }

    public static Codeable codeAll(ArrayList<? extends Codeable> arr){
        Codeable c = arr.get(0);

        for(Codeable item: arr){
            if(item.code() > c.code())
                c = item;
        }

        return c;

    }
}
