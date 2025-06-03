// example showing the concept of function
// with argument no return type
import java.util.Scanner;
class Demo9{
    void operation(int a1,int b1){
        System.out.println("Sum : "+(a1+b1));
    }
    public static void main(String args[]){
        Demo9 obj = new Demo9();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        obj.operation(a,b); // with argument
    }
}