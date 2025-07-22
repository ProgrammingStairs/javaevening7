// example showing the concept of Method Overriding
class Demo{
    protected void display(){
        System.out.println("display method called of parent");
    } 
}
class Demo12 extends Demo{
    @Override
    public void display(){
        System.out.println("display method called of child");
        super.display();
    } 
    public static void main(String args[]){
        Demo12 obj = new Demo12();
        obj.display();
    }
}