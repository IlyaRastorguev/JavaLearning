package LearningJava;

import java.util.ArrayList;
import java.util.List;

public class StringFormater {
    public static void main (String[] args) {
        List newList = new ArrayList<String>();
        newList.add("GH bddfh kj");
        newList.add("2134213");
        System.out.println(String.format("%1S", newList.get(0)));
        double a = 1/2;
    }
}
