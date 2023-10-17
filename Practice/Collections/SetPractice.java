package Practice.Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetPractice {
    public static void main(String args[]){
        Set<Integer>set1=new LinkedHashSet<>();
        set1.add(5);
        set1.add(81);
        set1.add(85);
        set1.add(88);
        set1.add(82);
        set1.add(88);
        Set<Integer>set2=new HashSet<>(set1);
        Set<Integer>set3=new TreeSet<>(set1);
        
        // System.out.println(set1.size());
        // System.out.println(set1.remove(5));
        System.out.println("linkedhashset"+set1);
        System.out.println("hash"+set2);
        System.out.println("tree"+set3);


    }
}
