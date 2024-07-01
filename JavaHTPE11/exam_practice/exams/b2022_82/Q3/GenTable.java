package JavaHTPE11.exam_practice.exams.b2022_82.Q3;


import JavaHTPE11.ClassLesson10.testQuestion3_generics.a.IllegalDataException;

import java.util.ArrayList;

public class GenTable<T extends GenLookUp<T>> {
    private ArrayList<T> arr;
    private ArrayList<Integer> keys;

    public GenTable(ArrayList<T> arr, ArrayList<Integer> keys) throws IllegalDataException {
        if (arr.size() != keys.size())
            throw new IllegalDataException();
        this.arr = arr;
        this.keys = keys;
    }

    public T find(int key) {
        for (int i = 0; i < keys.size(); i++) {
            if (keys.get(i) == key)
                return arr.get(i);
        }

        return null;
    }


}