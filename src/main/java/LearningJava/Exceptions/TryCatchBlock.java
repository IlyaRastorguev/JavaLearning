package LearningJava.Exceptions;

import java.io.IOException;

public class TryCatchBlock {
    public void tryCatch() {
        try {
            int count = Integer.parseInt("Hello i'm a error");
            System.out.println("Value = " + count);
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e);
            e.printStackTrace();
        }
    }
    public void exeptionLost() {
        try {
            try {
                throw new Exception("a");
            } finally {
                if (true)throw new IOException("b");
                System.err.println("c");
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.err.println("d");
            System.err.println(e.getMessage());
        }
    }
}
// Блоков catch может быть сколько угодно
// Операция не откатывает изменения в случае ошибки