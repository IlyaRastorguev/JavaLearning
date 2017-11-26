package LearningJava.Streams;

import java.lang.Thread;
import java.util.concurrent.TimeUnit;

public class InfinityThreadWithInterrupted extends Thread {

    @Override
    public void run() {
        super.run();
        while (!Thread.currentThread().isInterrupted()) { // если была остановка и при этом наш поток делал длительную операцию, то он остановится с эксепшеном
            try {
                System.out.println("Hey! I'm come back");
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("Обработка выхода из потока");
                Thread.currentThread().interrupt(); // обязательно нужно заново вызвать метод interrupt чтобы выйти из потока, иначе он не остановится
            }
        }
    }
}
