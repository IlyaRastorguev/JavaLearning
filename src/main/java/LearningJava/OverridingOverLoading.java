package LearningJava;

import javax.naming.PartialResultException;

public class OverridingOverLoading {
    // раннее связывание - связывание на моменте компиляции кода, до запуска приложения
    // позднее связывание - связывание в процессе работы кода
    static class Parent {
        void test() {
            System.out.println("Some text");
        }
    }

    static class Child extends Parent {
        void test() {
            System.out.println("Some text 2");
        }
    }

    static void use(Child item) {
        System.out.println("Using child");
        item.test();
    }

    static void use(Parent item) {
        System.out.println("Using Parent");
        item.test();
    }

    public static void main(String arg[]) {
        Parent item = new Child(); // Пример полиморфизма, то есть парадигмы, что наследуемые обьекты взаимозаменяемые
        use(item);                 // При компиляции будет вызван метод из паррента, при выполнении метод из чайлда
    }
}
