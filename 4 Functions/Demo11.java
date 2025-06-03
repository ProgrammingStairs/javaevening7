// example showing the concept of function
import java.util.Scanner;
class Demo11{
    void operation(int a1,int b1){
        System.out.println("Sum : "+(a1+b1));
        System.out.println("Sub : "+(a1-b1));
        System.out.println("Mul : "+(a1*b1));
        System.out.println("Div : "+(a1/b1));
        System.out.println("Mod : "+(a1%b1));
    }
    public static void main(String args[]){
        Demo11 obj = new Demo11();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        obj.operation(a,b);
    }
}