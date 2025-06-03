// example showing the concept of function
import java.util.Scanner;
class Demo16{
    int a,b;
    void setData(int a,int b){
        this.a=a;
        this.b=b;
    }
    void swap(Demo16 obj){
        int temp = obj.a;
        obj.a = obj.b;
        obj.b = temp;
        System.out.println("After Swapping in swap : \na : "+a+"\nb : "+b);
    }
    public static void main(String args[]){
        Demo16 obj = new Demo16();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
            obj.setData(a,b);
        System.out.println("Before Swapping : \na : "+obj.a+"\nb : "+obj.b);
            obj.swap(obj);
        System.out.println("After Swapping in main : \na : "+obj.a+"\nb : "+obj.b);
    }
}