package SeleniumPractice.JavaPractice.String;

public class StringComp {
    public static void main(String[] args) {

        String s1 = "silent";
        String s2 = "listen";

        int a = s1.compareTo(s2);
        int b = s2.compareTo(s1);
        System.out.println(a);
        System.out.println(b);

        if (a + b == 0) {
            System.out.println("characters are same");
        } else {
            System.out.println("characters are not same");
        }


    }
}


