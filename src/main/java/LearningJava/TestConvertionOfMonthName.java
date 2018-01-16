package LearningJava;

import java.text.SimpleDateFormat;
import java.time.Month;
import java.util.*;

public class TestConvertionOfMonthName {

    private static SimpleDateFormat SDF = new SimpleDateFormat("MMM");

    public static void main(String[] argv) throws Exception {
        System.out.println(new SimpleDateFormat(
                        "MMM", Locale.ENGLISH).format(
                new SimpleDateFormat("yyyy-MM-dd").parse("2017-06-01")
                )
        );
        System.out.println(Month.of(1));
    }
}

