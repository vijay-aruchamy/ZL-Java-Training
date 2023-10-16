package Practice.Collections;

import java.util.Arrays;

public class MyArrayList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private static Object elements[];

    public MyArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public void add(E e) {
        if (size == elements.length) {
            ensureCapacity();
        }
        // System.out.println("ina dd");
        elements[size++] = e;
    }
    // public void add(int index, E e) {
    //     size++;
    //     if (size == elements.length) {
    //         ensureCapacity();
    //     }
    //     for(int i=index;i<elements.length-1;i++){
    //         Object temp = elements[i+1];
    //         elements[i+1]=elements[i];
    //     }
    //     elements[index]=e;
    //     System.out.println(Arrays.toString(elements));
    // }


    private void ensureCapacity() {
        int newSize = elements.length * 2;
        System.out.println("in");
        elements = Arrays.copyOf(elements, newSize);
    }

    public E get(int i) {
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) elements[i];
    }
    public static void main(String args[]){
        MyArrayList l1=new MyArrayList();
        l1.add("Hi");
        l1.add(10);
        l1.add(15);
        l1.add(35);
        l1.add(45);
        l1.add(55);
        l1.add(2,65);
        System.out.println(Arrays.toString(elements));
    }
}