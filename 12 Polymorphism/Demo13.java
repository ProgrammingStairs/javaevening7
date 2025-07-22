// example showing the concept of Run time polymorphism
class Demo{
    void display(){
        System.out.println("display method called of parent");
    } 
}
class Demo13 extends Demo{
    @Override
    public void display(){
        System.out.println("display method called of child");
    } 
    public static void main(String args[]){
        Demo obj = new Demo13(); // upcasting
        obj.display();
    }
}