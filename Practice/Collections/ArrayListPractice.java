package Practice.Collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListPractice {
    public static void main(String args[]){
        ArrayList <Integer> n1=new ArrayList<>();
        ArrayList <String> s1=new ArrayList<>();
        ArrayList <Character> c1=new ArrayList<>();
        ArrayList <Float> f1=new ArrayList<>();

        n1.add(5);
        n1.add(25);
        n1.add(35);
        n1.remove(2);
        n1.add(2,15);
        System.out.println(n1);

        s1.add("Hi");
        s1.add("Hello");
        s1.add("HIHello");
        s1.add("Bye");
        s1.remove("Hello");
        s1.remove(2);
        System.out.println(s1);

        c1.add('a');
        c1.add('b');
        c1.add('c');
        c1.add('d');

        f1.add(1.1f);
        Collections.sort(n1);
        System.out.println(n1);
        Collections.reverse(n1);
        System.out.println(n1);
        }
}
