package LearningJava;

public class StaticFields {
    static class ClassWithStaticField {
        static String field = "2";
    }

    public static void main(String args []) {
        String fieldFromStaticClass = ClassWithStaticField.field;
        System.out.println(fieldFromStaticClass);
    }
}
