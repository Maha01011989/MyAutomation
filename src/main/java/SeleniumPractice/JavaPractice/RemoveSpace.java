package SeleniumPractice.JavaPractice;

public class RemoveSpace {


    public static void main(String[] args) {

        String s = "    Hello     Selenium     ";
        System.out.println(s.replaceAll("\\s+", ""));
        System.out.println(s.trim());


    }

}
