package SeleniumPractice.JavaPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Collections extends HashMap {

    public static void main(String[] args) {


        HashMap<Integer,String> hm= new HashMap<>();

        hm.put(1,"maha");
        hm.put(2,"lakshmi");
        hm.put(3,"java");

        List<String> list=new ArrayList<String>();


        for(Map.Entry<Integer,String> entry:hm.entrySet())
        {

            list.add(entry.getValue());

            System.out.println("The Key and value pairs are " + entry.getKey()+ " " + entry.getValue());
          //  entry.getKey()
        }

        System.out.println(list);


       // hm.forEach((k,v)-> System.out.println(k+" "+v));
    }


}
