package Practice.Collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListPractice {
    public int add(int element){
        
        return 0;
    }
    public int add(int index,int element){
        
        return 0;
    }
    public int remove(int index){

        return 0;
    }
    public int get(int index){

        return 0;
    }
    public static void main(String args[]){
        ArrayListPractice n1=new ArrayListPractice();
        ArrayList <String> s1=new ArrayList<>(10);
        ArrayList <Character> c1=new ArrayList<>();
        ArrayList <Float> f1=new ArrayList<>();

        n1.add(5);
        n1.add(25);
        n1.add(35);
        n1.remove(2);
        n1.add(2,15);
        // System.out.println(n1);

        s1.add("Hi");
        s1.add("Hello");
        s1.add("HIHello");
        s1.add("Bye");
        // s1.remove("Hello");
        // s1.remove(2);
        int size=s1.size();
        System.out.println(s1 +" "+size);

        c1.add('a');
        c1.add('b');
        c1.add('c');
        c1.add('d');

        f1.add(1.1f);
        Collections.sort(c1);
        System.out.println(n1);
        Collections.reverse(c1);
        System.out.println(n1);
        }
}
