// example showing the concept of Constructor
import java.util.Scanner;
class Demo5{
    int rno;
    double per;
    String name;
    // constructor
    Demo5(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Roll Number : ");
        rno=sc.nextInt();

        System.out.println("Enter Percentage : ");
        per = sc.nextDouble();
        
        sc.nextLine();
        System.out.println("Enter Name : ");
        name = sc.nextLine();

        System.out.println("Default Constructor called");
    }
    void display(){
        System.out.println("Name : "+name);
        System.out.println("Roll Number : "+rno);
        System.out.println("Percentage : "+per);
    }
    public static void main(String args[]){
        Demo5 obj = new Demo5();
        obj.display();
    }
}
