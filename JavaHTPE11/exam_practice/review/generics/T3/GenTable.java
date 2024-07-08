package JavaHTPE11.exam_practice.review.generics.T3;


import JavaHTPE11.ClassLesson10.testQuestion3_generics.a.IllegalDataException;

import java.util.ArrayList;
import java.util.HashMap;

public class GenTable<T extends Lookup<T>> {
    private HashMap<Integer, T> hm;

    public GenTable(ArrayList<Integer> keys, ArrayList<T> values) throws IllegalDataException {
        hm = new HashMap<Integer, T>();
        if (keys.size() != values.size())
            throw new IllegalDataException();
        for (int i = 0; i < keys.size(); i++) {
            hm.put(keys.get(i), values.get(i));
        }
    }


    public T find(Integer key) {
        return hm.get(key);
    }


}

