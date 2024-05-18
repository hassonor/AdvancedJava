package JavaHTPE11.ch_21_custom_generic_data_structures.ex1_generic_list_class.exams;

import java.util.HashMap;

public class Question2 {
    public static void main(String[] args) {


    }


//    public static <K extends Comparable<K>, T> HashMap<K, T> grep(HashMap<K, T> hm, K keyVal) {
//        HashMap<K, T> newHM = new HashMap<K, T>();
//        Set<K> keys = hm.keySet();
//
//        for (K key : keys) {
//            if (key.compareTo(keyVal) > 0)
//                newHM.put(key, hm.get(key));
//        }
//        return newHM;
//    }

    public static <K extends Comparable<K>, T> HashMap<K, T> grep(HashMap<K, T> hm, K keyVal) {
        HashMap<K, T> newHM = new HashMap<K, T>();
      

        return newHM;
    }

}


