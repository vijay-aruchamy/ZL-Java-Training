package Practice.Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class MapPractice {
    public static void main(String args[]){
        
        Map<Integer,String>m1=new HashMap<>();
        Map<Integer,String>m2=new LinkedHashMap<>();
        Map<Integer,String>m3=new TreeMap<>(m1);
        //PUT METHOD
        m1.put(1,"Paul");
        m1.put(2,"Deepak");
        m1.put(3,"PaulDeepak");
        m1.put(4,"Hi");
        m1.put(5,"Hello");

        //ITERATION WAYS
        for(Map.Entry<Integer, String> map : m1.entrySet()){
            System.out.println(map.getKey()+" "+map.getValue());
        }
        for(int a:m1.keySet()){
            System.out.println(a);
        }
        for(String a:m1.values()){
            System.out.println(a);
        }
        m1.forEach((k,v)->System.out.println("Key: "+k+"  "+"Value: "+v));

        //METHODS
        System.out.println(m1.containsKey(3));
        System.out.println(m1.containsValue("Hi"));
        System.out.println(m1.entrySet());
        System.out.println(m1.keySet());
        System.out.println(m2.isEmpty());
        m2.putAll(m1);
        System.out.println(m2);
        System.out.println(m2.equals(m1));
        System.out.println(m2.getOrDefault(10,"Java"));
        System.out.println(m2.hashCode());
        System.out.println(m1.hashCode());
        System.out.println(m1.get(3));
        System.out.println(m3);


    }
}
