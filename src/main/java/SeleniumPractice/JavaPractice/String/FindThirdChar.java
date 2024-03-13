package SeleniumPractice.JavaPractice.String;

public class FindThirdChar {
    public static void main(String[] args) {

        String s = "Welcome to Naveen Automation Labs !";
        int j=0;
        char[] c=s.toCharArray();
         for(int i=0;i<c.length;i++)
         {
             if(c[i]=='e')
             {
               j++;
             }
             if(j==3)
             {
                 System.out.println("The third e is at the index position" + i);
                 break;
             }
         }
    }
}
