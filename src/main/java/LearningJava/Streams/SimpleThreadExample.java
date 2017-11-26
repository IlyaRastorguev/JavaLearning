package LearningJava.Streams;

import java.lang.Thread;
import java.util.concurrent.TimeUnit;

public class SimpleThreadExample extends Thread {
    private String name;
    public SimpleThreadExample(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        super.run();
        System.out.println("Thread " + name + " is running now");
        try {
            for(int count = 0; count < 5; count++) {
                System.out.println("Thread " + name + " is count to " + count);
                TimeUnit.SECONDS.sleep(1);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Thread " + name + " is finished working");
        }
    }
}
