package SeleniumPractice.JavaPractice.String;

public class RemoveAllExceptDigits {

    public static void main(String[] args) {

        String s = "Your id is: 12345";
        System.out.println(s.replaceAll("\\D+", ""));

    }
}
