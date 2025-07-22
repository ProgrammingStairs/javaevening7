// example showing the concept of Method Overriding
class Demo{
    void display(){
        System.out.println("display method called of parent");
    } 
}
class Demo10 extends Demo{
    @Override
    void display(){
        System.out.println("display method called of child");
    } 
    public static void main(String args[]){
        Demo10 obj = new Demo10();
        obj.display();
    }
}