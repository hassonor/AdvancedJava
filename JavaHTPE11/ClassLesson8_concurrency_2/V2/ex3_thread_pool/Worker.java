package JavaHTPE11.ClassLesson8_concurrency_2.V2.ex3_thread_pool;

public class Worker extends Thread {
    private boolean m_bLive;
    private IManagerToWorker m_Manager = null;
    private static int m_nWorkerCounter;
    private int m_nWorkerID;
    private Object m_container;

    public Worker(IManagerToWorker manager, Object container) {
        m_Manager = manager;
        m_container = container;
        m_bLive = true;

    }

    public void run() {
        m_nWorkerID = ++m_nWorkerCounter;

        while (m_bLive) {
            Job job = null;
            synchronized (m_container) {
                job = m_Manager.getJob();
            }
            while (job != null) {
                System.out.println("Cable Guy No #" + m_nWorkerID + " is working");
                job.execute();
                synchronized (m_container) {
                    job = m_Manager.getJob();
                }
            }
            try {
                System.out.println("Worker No. " + m_nWorkerID + " is waiting");
                synchronized (m_container) {
                    m_container.wait();
                }
                System.out.println("Worker No. " + m_nWorkerID + " was notified");
            } catch (Exception e) {
                System.err.println(e);
            }
        }
    }
}