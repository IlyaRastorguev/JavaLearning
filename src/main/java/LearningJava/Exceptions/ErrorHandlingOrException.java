package LearningJava.Exceptions;

import java.util.ArrayList;

public class ErrorHandlingOrException {
    static ArrayList<String> unchecked = new ArrayList<String>();
    static ArrayList<String> checked = new ArrayList<String>();

    public void fillUnchecked() {
        unchecked.add("ArrayIndexOutOfBoundsException");
        unchecked.add("ClassCastException");
        unchecked.add("IllegalArgumentsException");
        unchecked.add("IllegalStateException");
        unchecked.add("NullPointerException");
        unchecked.add("NumberFormatException");
        unchecked.add("AssertionException");
        unchecked.add("ExceptionInInitializerError");
        unchecked.add("StackOverflowError");
        unchecked.add("NoClassDefFoundError");
    }

    public void fillChecked() {
        checked.add("IOException");
        checked.add("FileNotFoundException");
        checked.add("ParseException");
        checked.add("ClassNotFoundException");
        checked.add("CloneNotSupportedException");
        checked.add("InstantiationException");
        checked.add("InterruptedException");
        checked.add("NoSuchMethodException");
        checked.add("NoSuchFieldException");
    }

    static class Exceptions {
        public void method1() throws NullPointerException {
            throw new NullPointerException("Это фиаско братан");
        }
    }

    public static void main(String arg[]) {
        TryCatchBlock showTryCatch = new TryCatchBlock();
        try {
            new Exceptions().method1();
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        showTryCatch.tryCatch();
        showTryCatch.exeptionLost();

    }
}
