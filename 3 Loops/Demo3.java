// program to check whether entered number is palindrome or not
import java.util.Scanner;
class Demo3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        int temp = num;
        int rev = 0;
        while(num>0){
            int rem = num%10;
            rev = rev * 10 + rem;
            num = num/10;
        }        
        if(temp==rev)
            System.out.println("Number is palindrome");
        else
            System.out.println("Number is not palindrome");
    }
}