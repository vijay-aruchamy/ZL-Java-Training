package Practice.Problems.preventObjCreation;

public class A {
    private static A firstInstance=null;
    private A(){
        
        }
    public static A getInstance(){
        if(firstInstance==null){
            try{
            firstInstance=new A();
            return firstInstance;        
            }
            catch(CustomException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String args[]){
    

    }
}

