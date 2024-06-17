package JavaHTPE11.ClassLesson8_concurrency_2.V2.ex3_thread_pool;

public class Main {
    private static int m_nWorkers;

    public static void main(String args[]) {

        m_nWorkers = 10;
        Main m = new Main(m_nWorkers);

    }

    public Main(int nGuys) {
        Manager manager = new Manager(m_nWorkers);
        manager.addJob(new InstallCables());
        manager.addJob(new InstallCables());
        manager.addJob(new InstallCables());
        manager.addJob(new FixCables());
        manager.addJob(new InstallCables());
        manager.addJob(new InstallCables());
        manager.addJob(new InstallCables());
        manager.addJob(new FixCables());

    }


}