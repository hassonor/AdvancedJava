package JavaHTPE11.ClassLesson8_concurrency_2.V2.ex3_thread_pool;

import java.util.*;

public class JobContainer extends LinkedList<Job> {

    /**
     *
     */
    private static final long serialVersionUID = -2180457103013152464L;

    public void addJob(Job job) {
        add(job);
    }

    public Job getJob() {
        if (size() != 0) {
            Job lastJob = (Job) getLast();
            remove(lastJob);
            return lastJob;
        } else
            return null;
    }

}
