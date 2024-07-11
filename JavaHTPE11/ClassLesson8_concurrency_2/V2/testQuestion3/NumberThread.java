package JavaHTPE11.ClassLesson8_concurrency_2.V2.testQuestion3;

class NumberThread extends Thread {
    private int val;
    private NumberThread neighbour;
    private boolean checked = false;
    private SharedCounter sharedCounter;

//    private int index; //debug


    public NumberThread(SharedCounter sharedCounter) {
//        this.index = index;//debug
        this.sharedCounter = sharedCounter;
        //val = (int) (Math.random()*100);
    }

    public void setNeighbour(NumberThread neighbour) {
        this.neighbour = neighbour;

    }

    public void run() {
        val = (int) (Math.random() * 100);

        int newVal = neighbour.getVal();//1
        waitUntilCheck();//2
        if (newVal < val)//3
            val = newVal;
        sharedCounter.increase();
        sharedCounter.waitUntilPrint();
//        System.out.println("finished " + index);//debug

    }

    public synchronized void waitUntilCheck() {
        try {
            if (!checked) //why can we use here "if" and not "while" ?
                wait();
        } catch (InterruptedException exc) {
            exc.printStackTrace();
        }
    }

    public synchronized int getVal() {
        checked = true;
        notify();
        return val;
    }

    public String toString() {
        return String.valueOf(val);
    }


}