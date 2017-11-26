package LearningJava.Streams;

import java.lang.Thread;
import java.util.concurrent.TimeUnit;

public class InfinityThread extends Thread {

    public String name;

    public InfinityThread(String name) {
        this.name = name;
    }

    private boolean stopIt = false;

    public void stopTheCycle() {
        System.out.println("Stopping....");
        stopIt = true;
    }

    @Override
    public void run() {
        while (!stopIt) {
            try {
                System.out.println("Thread is never stops, my name is" + name);
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
