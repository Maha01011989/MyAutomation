package SeleniumPractice.JavaPractice.String;

import java.util.HashSet;

public class findDuplicates {

    public static void main(String[] args) {

        String str1 = "Yellow,Orange,Green,Yellow,Black,White,Black,Yellow";

        HashSet<String> hs = new HashSet<>();

        String[] strArr = str1.split(",");

        for (int i = 0; i < strArr.length; i++) {
            for (int j = i + 1; j < strArr.length; j++) {
                if (strArr[i].equals(strArr[j])) {
                    hs.add(strArr[i]);
                }
            }
        }
        System.out.println(hs);


    }
}
