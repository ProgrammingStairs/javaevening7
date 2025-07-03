// example showing the concept of Constructor
import java.util.Scanner;
class Demo9{
    int rno;
    double per;
    String name;
    // constructor
    Demo9(int rno,double per,String name){
        this.rno=rno;
        this.per=per;
        this.name=name;
        System.out.println("Parameterized Constructor called");
    }
    Demo9(Demo9 objNew){
        this.rno = objNew.rno;
        this.per = objNew.per;
        this.name = objNew.name;
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

        Demo9 obj = new Demo9(rno,per,name);
        Demo9 obj1 = new Demo9(obj);

        obj.display();
        System.out.println("\nAfter copying\n");
        obj1.display();
        
    }
}
