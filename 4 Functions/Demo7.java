// example showing the concept of function
// no argument no return type
import java.util.Scanner;
class Demo7{
    void operation(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Sum : "+(a+b));
    }
    public static void main(String args[]){
        Demo7 obj = new Demo7();
        obj.operation();
    }
}