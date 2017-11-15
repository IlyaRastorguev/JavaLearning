package LearningJava;

public class StringBuilderMethod {
    public static void main(String arg[]) {
        String st = "test";
        int count = 0;
        String line = "";
        while (count < 5) {
            line = MakeString(st, line);
            count++;
        }
        System.out.println(line);
    }
    private static String MakeString(String st, String line) {
        StringBuilder builder = new StringBuilder(line + " " + st);
        return builder.toString();
    }
}
