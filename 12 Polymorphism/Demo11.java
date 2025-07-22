// example showing the concept of Method Overriding
// final method cannot override
// static method cannot override
class Demo{
    // final void display(){
    //     System.out.println("display method called of parent");
    // } 
    static void display(){
        System.out.println("display method called of parent");
    } 
}
class Demo11 extends Demo{
    @Override
    void display(){
        System.out.println("display method called of child");
    } 
    public static void main(String args[]){
        Demo11 obj = new Demo11();
        obj.display();
    }
}