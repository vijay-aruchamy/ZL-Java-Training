package Practice;
public class Sample {

    static int num=10;
    static{
    System.out.println(num);
    }
    public static void main(String args[]){
        System.out.println("Main Method");
    }

    public static void display(){
        System.out.println("Hii");
    }
    static{
        System.out.println("static");
        display();
    }

}
