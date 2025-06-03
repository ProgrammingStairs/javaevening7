// example showing the concept of function
import java.util.Scanner;
class Demo15{
    void swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping in swap : \na : "+a+"\nb : "+b);
    }
    public static void main(String args[]){
        Demo15 obj = new Demo15();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Before Swapping : \na : "+a+"\nb : "+b);
            obj.swap(a,b);
        System.out.println("After Swapping in main : \na : "+a+"\nb : "+b);
    }
}