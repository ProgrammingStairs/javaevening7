// example showing the concept of Constructor
import java.util.Scanner;
class Demo10{
    int rno;
    double per;
    String name;
    // constructor
    Demo10(){}
    Demo10(int rno,double per,String name){
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

        Demo10 obj = new Demo10(rno,per,name);
        Demo10 obj1 = new Demo10();

        obj1.rno = obj.rno;
        obj1.per = obj.per;
        obj1.name = obj.name;

        obj.display();
        System.out.println("\nAfter copying\n");
        obj1.display();
        
    }
}
