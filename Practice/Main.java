package Practice;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int zeroCount=0,oneCount=0,twoCount=0;
        for(int i=0;i<arr.length;i++){
            switch(arr[i]){
                case 0:
                zeroCount++;
                break;
                case 1:
                oneCount++;
                break;
                case 2:
                twoCount++;
                break;
            }
        }
        int j=0;
        while(zeroCount>0){
            arr[j++]=0;
            zeroCount--;
        }
        while(oneCount>0){
            arr[j++]=1;
            oneCount--;
        }
        while(twoCount>0){
            arr[j++]=2;
            twoCount--;
        }
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}
