package Practice;
public class Hello{
    public static void main(String args[]){
        // final int num=10;
        Hello a=new Hello();
        System.out.println(a.add(1,2));
        System.out.println(sub(2,1));
        System.out.println(multiply(2,1));
    //  num=13;
    //  final variable cannot be changed
    }
    public int add(int n1,int n2){
        return n1+n2;
    }
    public static int sub(int n1,int n2){
        return n1-n2;
    }
    static final int multiply(int n1,int n2){
        return n1*n2;
    }
}
//final class cannot be inherited
class Hello1 extends Hello{
    // final method cannot be overriden
    // static int multiply(int n1,int n2){
    //     return n1/n2;
    // }
    
}