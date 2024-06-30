package JavaHTPE11.exam_practice.exams.a2023_88.Q4;


import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class Coder extends Thread {
    private Storage s;

    public Coder(Storage s) {
        this.s = s;
    }

    @Override
    public void run() {
        Data data = s.getData();
        while (data != null) {
            data.setText(URLEncoder.encode(data.getText(), StandardCharsets.UTF_8));
            s.setData(data);
            data = s.getData();
        }
    }
}
