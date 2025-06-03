// example showing the concept of function
// no argument with return type
import java.util.Scanner;
class Demo8{
    int operation(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        return a+b;
    }
    public static void main(String args[]){
        Demo8 obj = new Demo8();

        int res = obj.operation();
        System.out.println("Sum : "+res);

        System.out.println("Sum : "+obj.operation());
    }
}