// example showing the concept of function
// with argument with return type
import java.util.Scanner;
class Demo10{
    int operation(int a1,int b1){
        return a1+b1;
    }
    public static void main(String args[]){
        Demo10 obj = new Demo10();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Sum : "+obj.operation(a,b)); // with argument
    }
}