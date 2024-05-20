package JavaHTPE11.ClassLesson6_generics.ex10;

class GenericInsertionSorter {
    public <T extends Comparable<T>> void sort(T[] elems) {
        int size = elems.length;

        for (int outerLoopIdx = 1; outerLoopIdx < size; ++outerLoopIdx) {
            for (int innerLoopIdx = outerLoopIdx; innerLoopIdx > 0; --innerLoopIdx) {
                if (elems[innerLoopIdx - 1].compareTo(elems[innerLoopIdx]) > 0) {
                    T temp = elems[innerLoopIdx - 1];
                    elems[innerLoopIdx - 1] = elems[innerLoopIdx];
                    elems[innerLoopIdx] = temp;
                }
            }
        }
    }
}