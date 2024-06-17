package JavaHTPE11.ClassLesson8_concurrency_2.V2.ex3_thread_pool;

import java.util.LinkedList;


public class WorkerContainer extends LinkedList<Worker> {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public WorkerContainer() {

    }

    public void addWorker(Worker worker) {
        add(worker);
    }


}