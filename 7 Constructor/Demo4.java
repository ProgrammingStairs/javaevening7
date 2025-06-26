// example showing the concept of Constructor
class Demo4{
    int rno;
    double per;
    String name;
    // constructor
    Demo4(){
        rno=100;
        per = 34.43;
        name = "Andrew Anderson";
        System.out.println("Default Constructor called");
    }
    void display(){
        System.out.println("Name : "+name);
        System.out.println("Roll Number : "+rno);
        System.out.println("Percentage : "+per);
    }
    public static void main(String args[]){
        Demo4 obj = new Demo4();
        obj.display();
    }
}
