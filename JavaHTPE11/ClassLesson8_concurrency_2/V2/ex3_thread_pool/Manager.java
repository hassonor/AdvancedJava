package JavaHTPE11.ClassLesson8_concurrency_2.V2.ex3_thread_pool;

public class Manager implements IManagerToWorker, IClientToManager {
    private WorkerContainer m_Workers = null;
    private JobContainer m_Jobs = null;
    private int m_nNumOfWorkers;

    public Manager(int workers) {
        m_Workers = new WorkerContainer();
        m_Jobs = new JobContainer();
        m_nNumOfWorkers = workers;
        createWorkers();
    }

    public Manager() {
        m_Workers = new WorkerContainer();
        m_Jobs = new JobContainer();
        m_nNumOfWorkers = 5;
        createWorkers();

    }

    public void createWorkers() {
        for (int i = 0; i < m_nNumOfWorkers; i++) {
            Worker worker = new Worker(this, m_Jobs);
            worker.start();
            m_Workers.addWorker(worker);
        }
    }

    //implemantion of IManager

    public void addJob(Job job) {
        synchronized (m_Jobs) {
            m_Jobs.addJob(job);
        }
        try {
            synchronized (m_Jobs) {
                m_Jobs.notify();
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public Job getJob() {
        synchronized (m_Workers)//Why?
        {
            return m_Jobs.getJob();
        }
    }

    public void work(String jobStr) {
        System.out.println(jobStr);
    }

}