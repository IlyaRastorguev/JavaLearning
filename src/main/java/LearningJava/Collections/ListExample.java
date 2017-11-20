package LearningJava.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

interface ListInterface extends Collection {
    public void set(int a, Object b);
    int get(int a);
    int indexOf(Object b);
    // есть пара доп методов, которых нет в коллекциях
}

public class ListExample  {
    static ArrayList arrayList = new ArrayList<String>();
    static LinkedList linkedList = new LinkedList<Integer>();
    public static void main(String[] arg) {
        arrayList.add("Привет");
        arrayList.set(0, "Пока");
        System.out.println(arrayList.indexOf("Пока"));
        linkedList.add(1);
        linkedList.add(2);
        System.out.println(linkedList.getFirst());
    }

}

// Список упорядочен, то есть ключ значение
// в отличие от множества
// LinkedList тяжелее чем ArrayList