// example showing the concept of Constructor chaining
import java.util.Scanner;
class Demo11{
    int rno;
    double per;
    String name;
    // constructor
    Demo11(){
        this(101);
        System.out.println("no argument constructor called");
    }
    Demo11(int rno){
        this(rno,56.67);
    }
    Demo11(int rno,double per){
        this(rno,per,"Andrew Anderson");
    }
    Demo11(int rno,double per,String name){
        this.rno=rno;
        this.per=per;
        this.name=name;
        display();
    }
    void display(){
        System.out.println("Name : "+name);
        System.out.println("Roll Number : "+rno);
        System.out.println("Percentage : "+per);
    }
    public static void main(String args[]){
        new Demo11();
    }
}
