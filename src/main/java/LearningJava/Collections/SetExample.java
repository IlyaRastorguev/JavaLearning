package LearningJava.Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    static Set<String> set = new HashSet<String>();
    static Set<Integer> setInt = new TreeSet<>(); // Сохраняет порядок на множестве
    public static void main(String[] arg) {
        set.add("Привет, я строка");
        set.add("Привет, я тоже строка");
        set.add("Привет, я строка");
        System.out.println(set);
    }
}
// множество уникальных значений
// При добавлении тех же самых значений ничего не изменится
// так как они уже есть