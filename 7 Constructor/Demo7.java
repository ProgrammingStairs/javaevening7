// example showing the concept of parameterized Constructor
import java.util.Scanner;
class Demo7{
    int rno;
    double per;
    String name;
    // constructor
    Demo7(){
        System.out.println("no argument constructor called");
    }
    Demo7(int rno,double per,String name){
        this.rno=rno;
        this.per=per;
        this.name=name;
        System.out.println("Parameterized Constructor called");
    }
    void display(){
        System.out.println("Name : "+name);
        System.out.println("Roll Number : "+rno);
        System.out.println("Percentage : "+per);
    }
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Roll Number : ");
        int rno=sc.nextInt();

        System.out.println("Enter Percentage : ");
        double per = sc.nextDouble();
        
        sc.nextLine();
        System.out.println("Enter Name : ");
        String name = sc.nextLine();

        Demo7 obj1 = new Demo7();
        Demo7 obj = new Demo7(rno,per,name);
        obj.display();
    }
}
