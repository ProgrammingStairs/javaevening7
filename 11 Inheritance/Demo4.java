// example showing the concept of super keyword 

class Parent{
  Parent(){
       System.out.println("parent class constructor called");
    }
}
class Child extends Parent{
  Child(int rno){
    super();
       System.out.println("child class constructor called");
    }
}
class Demo4{
    public static void main(String args[]){
       Child cobj = new Child(101);
    }   
}