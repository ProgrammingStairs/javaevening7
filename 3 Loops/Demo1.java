// program to find out the sum of individual digits of a number
import java.util.Scanner;
class Demo1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three digit Number : ");
        int num = sc.nextInt();
        if(num>99 && num<1000){
            int last = num%10;
            int middle = (num/10)%10;
            int first = num/100;

            System.out.println("Sum : "+(first+middle+last));
        }else
            System.out.println("Not a three digit number");
    }
}