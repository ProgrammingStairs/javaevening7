// program to reverse a number
import java.util.Scanner;
class Demo2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        int rev = 0;
        while(num>0){
            int rem = num%10;
            rev = rev * 10 + rem;
            num = num/10;
        }        
        System.out.println("Reverse Number : "+rev);
    }
}