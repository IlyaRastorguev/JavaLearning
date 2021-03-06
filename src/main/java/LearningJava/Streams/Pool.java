package LearningJava.Streams;

import java.lang.Thread;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Pool {

    static class ThreadExample extends Thread {

        private String name;

        public ThreadExample(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            super.run();
            System.out.println("My name is" + name);
        }
    }

    public static void main(String[] arg) {
        int cores = Runtime.getRuntime().availableProcessors(); // получение количества доступных потоков
        System.out.println("There is " + cores + " are available now");
        ExecutorService service = Executors.newFixedThreadPool(2); // создание пула на конечное число потоков, выше которого выполняться не будет

        List<java.util.concurrent.Future> futures = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            java.util.concurrent.Future future =  service.submit(new ThreadExample("thread " + i));
            futures.add(future);
        }
    }
}
