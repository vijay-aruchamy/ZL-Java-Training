package Practice.Collections;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {
    public static void main(String args[]){
        Map<Integer,String>m1=new HashMap<>();
        m1.put(1,"Paul");
        m1.put(2,"Deepak");
        m1.put(3,"PaulDeepak");
        m1.put(4,"Hi");
        m1.put(5,"Hello");
        System.out.println(m1.containsKey(3));
        System.out.println(m1.get(3));
    }
}
