// example
/*
import java.util.Scanner;
class Demo8{
    private int rno;
    public static void main(String args[]){
        Demo8 obj = new Demo8();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter roll number : ");
        obj.rno = sc.nextInt();

        System.out.println("Roll Number : "+obj.rno);
    }
}
*/

// example showing the concept of getter and setter method
import java.util.Scanner;
class Student{
    private int rno;
    // setter method 
    public void setRollNumber(int rno){
        this.rno=rno;
    }
    // getter method
    public int getRollNumber(){
        return rno;
    }
}
class Demo8{
    public static void main(String args[]){
        Student obj = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter roll number : ");
        int rno = sc.nextInt();
        obj.setRollNumber(rno);
        System.out.println("Roll Number : "+obj.getRollNumber());
    }
}