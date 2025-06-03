// program to check whether entered number is armstrong or not
import java.util.Scanner;
class Demo4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        int temp = num;
        int temp1 = num;
        int count = 0;
        double sum = 0 ;
        while(num>0){
            count++;
            num = num/10;
        }
        while(temp>0){
            int rem = temp%10;
            sum = sum + Math.pow(rem,count);
            temp = temp/10;
        }        
        if(temp1==sum)
            System.out.println("Number is Armstrong");
        else
            System.out.println("Number is not Armstrong");
    }
}