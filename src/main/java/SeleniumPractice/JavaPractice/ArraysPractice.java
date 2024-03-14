package SeleniumPractice.JavaPractice;

import java.util.Arrays;
import java.util.Collections;

public class ArraysPractice {

    public static void main(String[] args) {


        int[] a = new int[]{10, 20, 2, 3, 105, 68, 98, 100};
//find maximum
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }

        System.out.println(max);
//find minimum
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        System.out.println(min);

//sort an array in ascending order

         Arrays.sort(a);
        System.out.println(Arrays.toString(a));


        //sort an array in descending order

        //Arrays.sort(a,Collections.reverseOrder());


    }
}
