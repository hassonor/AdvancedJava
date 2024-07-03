package JavaHTPE11.exam_practice.exams.b2021_98.Q3;

public class Sentence implements Flippable<Sentence> {
    private String[] arr;

    public Sentence(String[] arr) {
        this.arr = arr;
    }

    public Sentence flip() {
        String[] arr2 = new String[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arr2[i] = new String(arr[arr.length - 1 - i]);
        }
        return new Sentence(arr2);
    }

}
