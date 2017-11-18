package LearningJava;

import java.util.ArrayList;

interface ClickListener {
    void onClick();
}

 public class Interfaces {
    static class UI implements ClickListener {
       public void onClick() {
            System.out.println("Нажали кнопку");
        }
    }

    static class BackEnd implements ClickListener {
         public void onClick() {
             System.out.println("Отправили ответ");
         }
    }

    public static void main(String arg[]) {
        BackEnd back = new BackEnd();
        UI front = new UI();
        ArrayList<ClickListener> list = new ArrayList<ClickListener>();
        list.add(back);
        list.add(front);
        for (int i = 0; i < list.size(); i++) {
            list.get(i).onClick();
        }
    }
}
