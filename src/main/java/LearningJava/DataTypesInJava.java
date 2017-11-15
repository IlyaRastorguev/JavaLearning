package LearningJava;


public class DataTypesInJava {
    static class StringWrapper {
        public StringWrapper(String st) {
            this.st = st;
        }
        String st;
    }
    public static void main(String arg[]) {
        int a = 4, b = 5;
        StringWrapper z = new StringWrapper("6");
        int c = a;
        showHowItWorks(a, b);
        showHowItWorks2(a, b, c);
        showHowItWorks3(a, z);
        System.out.println("Неизмененная " + z.st);
    }
    private static void showHowItWorks(int a, int b) {
        int c  = b;
        b = a;
        a = c;
        System.out.println("B = " + b + " A = " + a);
    }

    private static void showHowItWorks2(int a, int b, int c) {
        System.out.println("B = " + b + " A = " + a+ " C = " + c);
    }

    private static void showHowItWorks3(int a, StringWrapper z) {
        z.st = "" + a;
        System.out.println("Измененная " + z.st);
    }

}
