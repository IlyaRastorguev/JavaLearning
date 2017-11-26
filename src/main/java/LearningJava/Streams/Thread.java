package LearningJava.Streams;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

public class Thread   {

    // Первый метод
    // Класс Thread - класс работающий с многопоточностью
    // Для того, чтобы использовать много поточность нужно переопределить метод run после того, как отнаслеуемся
    static class MyThread extends java.lang.Thread {
        @Override
        public void run() {
            super.run();
                System.out.println("Thread 1 is done");
        }
    }

    // Второй метод
    // implements от интерфейса Runnable
    static class MySecondTHread implements Runnable {
        @Override
        public void run() {
            System.out.println("Thread 2 is done");
        }
    }

    // Третий метод, создать таймер
    static Timer timer = new Timer();

    public static void main(String[] arg) throws Exception {
        InfinityThread infinityThread = new InfinityThread("threaDDD");
        infinityThread.start(); // запускаем бесконечный поток
        TimeUnit.SECONDS.sleep(5); // даем нашему бесконечному потоку время поработать
        infinityThread.stopTheCycle(); // просим его остановиться
        java.lang.Thread infinityThread2 = new InfinityThreadWithInterrupted();
        infinityThread2.start();
        TimeUnit.SECONDS.sleep(5);
        infinityThread2.interrupt();
        java.lang.Thread thread_1 = new MyThread();
        thread_1.start();
        thread_1.join(); // Такой вызов ожидает выполнения того потока, из которого он был вызван
        // запускает код, который мы записали в методе run в отдельном потоке
        java.lang.Thread thread_2 = new java.lang.Thread(new MySecondTHread());
        // в конструктор нужно передать класс, который наследовался от интерфейса Runnable
        thread_2.start();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Thread 3 is done");
            }
        }, 60 * 1000);
        SimpleThreadExample threadExample = new SimpleThreadExample("thread 1");
        threadExample.start();
        threadExample.run(); // выполнится в том же потоке, что и основной мэйн
        threadExample.start(); // дважды запустить один и тот же поток нельзя
        threadExample.setDaemon(true); // такой поток не учитывается при завершении main
    }

}
