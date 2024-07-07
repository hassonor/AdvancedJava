package JavaHTPE11.exam_practice.review.concurrency.T2;

import JavaHTPE11.exam_practice.exams.a2023_88.Q4.firstWay.Data;

import static java.net.URLEncoder.encode;

public class Coder extends Thread {
    private Storage s;

    public Coder(Storage s) {
        this.s = s;
    }

    @Override
    public void run() {
        Data data = s.getData();
        while (data != null) {
            data.setText(encode(data.getText()));
            s.setData(data);
            data = s.getData();
        }
    }
}
