// example showing the concept of function

class Demo3{
    public void display(){
        System.out.println("display method called");
    }
    public static void main(String args[]){
        Demo3 obj1 = new Demo3(),obj2 = new Demo3(),obj3 = new Demo3();
        obj1.display();
        obj2.display();
        obj3.display();
    }
}