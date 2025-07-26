// example showing the concept of abstract class 

abstract class Parent{
    abstract void display(); 
}
class Child extends Parent{
    @Override
    void display(){
        System.out.println("display method called");
    }
    public static void main(String args[]){
        Parent obj = new Child();
        obj.display();
    }
}