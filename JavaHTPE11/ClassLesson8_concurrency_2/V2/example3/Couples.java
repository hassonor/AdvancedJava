package JavaHTPE11.ClassLesson8_concurrency_2.V2.example3;

class Couples extends Thread {
    String m_sHe, m_sShe;
    int m_nTime;

    public Couples(String he, String she, int time) {
        m_sHe = he;
        m_sShe = she;
        m_nTime = time;
    }

    public void run() {
        int i = 10000;
        try {
            while (i > 0) {
                System.out.print(m_sHe + "&");
                sleep(m_nTime);  // Sleep zzz�
                System.out.print(m_sShe + "\n");
                i--;
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

