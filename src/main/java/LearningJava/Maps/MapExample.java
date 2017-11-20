package LearningJava.Maps;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    static Map<Integer, String> map = new HashMap<>(); // хранит обьекты в связке ключ значение
    public static void main(String[] arg) {
        for(Map.Entry<Integer, String> entry: map.entrySet() ) { // способ итерирования по мапу
            int key = entry.getKey();
            String value = entry.getValue();
        }
    }
}
