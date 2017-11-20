package LearningJava.ReflectAPI;

interface TestInterface {
    void method1();
    void method2();
    String var1 = "";
}

public class ReflectAPI {
     class Test implements TestInterface {
        public Test() {

        }
        public Test(Object field) {}
        public void method1() {
            int a = 1;
        }
        public void method2() {
             String b = "b";
             System.out.println(var1);
        }
    }
    public static void main(String[] arg)  {
        Class clazz = Test.class;
        Test test;// TODO посмотри почему ошибка
        try {
            test = (Test) clazz.newInstance();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Finally");
        }
    }
}
