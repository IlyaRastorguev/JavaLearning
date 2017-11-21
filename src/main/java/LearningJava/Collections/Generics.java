package LearningJava.Collections;

import java.util.ArrayList;
import java.util.List;

public class Generics {
   private static class Box <T> {
        private T variable;
        T get() {
            return this.variable;
        }
        void set(T variable) {
            this.variable = variable;
            ArrayList<T> typeList = new ArrayList<>();
            typeList.add(variable);
            System.out.println(boxInfo(typeList));
        }

       private static <T> ArrayList<T> boxInfo(ArrayList<T> type) {
           System.out.println("There is " + type + " in that box");
           return  type;
       }
    }

    class T extends B {};

   class B {}

    class GenericsFeatures {
       List<String> str = new ArrayList<>();
       List<Object> obj;

       public void showHowWorks() {
//         this.obj = this.str;
//         ошибка в этом месте искуственная, для того, чтобы избежать ошибок рантайма при выполении кода
//         так как всё в Java - обьекты, то в obj можно было бы положить любой обьект, что в свою очередь может вызвать
//         exception
//         коллекции обьектов не являются наследниками друг друга
       }

        public <T extends B> List<T> howWeCanDo(List<T> list) { // в качестве B могут быть и интерфейсы тоже
           B obj = new B();
//           list.add(obj); в теории должно работать
//          при этом всем элементам коллекции будут доступны только методы из B
            return list;
        }
        public void test(List<? super Object> list) { //? любой тип
            Object obj = new Object();
            list.add(obj);
//      в такой конструкции можно только добавлять в коллекцию
//      мы знаем только чем ограничен выбор обьектов
        }
    }

    // Вложенные генерики
//    Map <String, ArrayList<Integer>> map;
    public static void main(String[] arg) {
        Box<String> box = new Box<>();
        box.set("SOme content");
        System.out.println(box.get());
    }
}
