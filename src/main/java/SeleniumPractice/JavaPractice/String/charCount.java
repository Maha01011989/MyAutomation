package SeleniumPractice.JavaPractice.String;

import java.util.HashMap;

public class charCount {

    public static void main(String[] args) {

        String s = "GaGoogle";

        HashMap<Character, Integer> hm = new HashMap<>();

        s = s.toUpperCase();

        char[] arr = s.toCharArray();
        int count = 1;
        for (char c : arr) {
            if (hm.containsKey(c)) {
                count = hm.get(c);
                hm.put(c, count + 1);
            } else {
                hm.put(c, count);
            }

        }
        hm.forEach((k,v) -> System.out.println(k  +":"+  v));
    }
}
