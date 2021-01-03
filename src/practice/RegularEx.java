package practice;

import java.io.Console;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularEx {
    public static void main(String[] args) {

    String[] data = {"no", "control", "music", "mc", "new", "happy", "year"};

    Pattern p = Pattern.compile("m[a-z]*");

        for (int i = 0; i < data.length; i++) {
            Matcher m = p.matcher(data[i]);

            if(m.matches())
                System.out.println(data[i] + ",");

        }


    }



}
