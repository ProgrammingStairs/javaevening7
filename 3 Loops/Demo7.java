// program to print table of all the numbers between two entered numbers
import java.util.Scanner;
class Demo7{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter initial and final number : ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        for(int num=n;num<=m;num++){
            System.out.println("\nTable of "+num);
            for(int j=1;j<=10;j++){
                System.out.println(num+" x "+j+" = "+(num*j));
            }
        }
   }
}