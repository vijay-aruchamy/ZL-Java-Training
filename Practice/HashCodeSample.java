package Practice;

import java.util.ArrayList;

public class HashCodeSample {
    public static void main(String args[]){
        HashCodeSample obj1=new HashCodeSample();
        HashCodeSample obj2=new HashCodeSample();
        String s1=new String("abc");
        String s2="abc";
        s1.hashCode();
        // String s2=new String("abc");
        ArrayList<Integer>a1=new ArrayList<>();
        a1.add(3);
        a1.add(13);
        a1.add(23);
        ArrayList<Integer>a2=new ArrayList<>();
        a2.add(3);
        a2.add(23);
        a2.add(23);
        int arr1[]={1,2,3};
        int arr2[]={4,5,6};

        System.out.println(a1.equals(a2));
        System.out.println(a1.hashCode()+"   "+a2.hashCode());
        System.out.println(a1.hashCode()+"   "+a2.hashCode());
        System.out.println("HashCode: "+obj1.hashCode() +" *** "+obj2.hashCode());
    }
}
