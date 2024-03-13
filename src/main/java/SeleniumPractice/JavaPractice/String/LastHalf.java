package SeleniumPractice.JavaPractice.String;

public class LastHalf {

    public static void main(String[] args) {
        String name="mahalakshmi";

        int len=name.length();

        name=name.substring(len/2,len);
        System.out.println(name);
    }
}
