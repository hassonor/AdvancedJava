package JavaHTPE11.ClassLesson11_test_questions.testQuestion3_concurrency.b;

import java.util.ArrayList;

public class ResourceThread extends Thread {
    ResourceAllocator ra;

    public ResourceThread(ResourceAllocator ra) {
        this.ra = ra;
    }

    @Override
    public void run() {
        ArrayList<Integer> resources = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            resources.add(ra.allocateResource());
        }

        for (int i = 0; i < resources.size(); i++) {
            ra.release(resources.get(i));
        }
    }
}
