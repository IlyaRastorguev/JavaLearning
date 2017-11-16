package LearningJava;

interface objectInterface {
    String field = "";
}

public class EqualsMethod {
    private static boolean equalsS(objectInterface obj1, objectInterface obj2) {
     return   obj1.equals(obj2);
    }
    static class ObjectBuilderR implements objectInterface {
        String field = "2";
    }
    public static void main(String args[]) {
        objectInterface obj1 = new ObjectBuilderR();
        objectInterface obj2 = new ObjectBuilderR();
        objectInterface obj3 = obj1;
        System.out.println("obj1 = obj2 " + equalsS(obj1, obj2));
        System.out.println("obj1 = obj3 " + equalsS(obj1, obj3));
    }
}
// Данный пример демонстрирует то, что два обьекта, которые по сути
// своей одинаковые, на самом деле два разных обьекта.
//  чтобы проверить одинаковые ли обьекты, нужно проверить все их поля
// Ни один обьект не равен null и null ни равен ничему
