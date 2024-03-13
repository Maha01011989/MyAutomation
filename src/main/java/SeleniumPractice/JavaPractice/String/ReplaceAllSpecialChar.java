package SeleniumPractice.JavaPractice.String;

public class ReplaceAllSpecialChar {
    public static void main(String[] args) {

        String s = "Hello!!! This is my value: .$12333*";
        System.out.println(s.replaceAll("[^a-z A-Z 0-9\\s$]",""));



    }
}
