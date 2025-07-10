// example showing the concept of initializer block


class Parent {
    Parent()
    {
        System.out.println("parent constructor called");
    }
}
class Demo19 extends Parent{
    {
        System.out.println("initializer block");
    }    
    Demo19(){
        
        System.out.println("constructor");
    }
    public static void main(String args[]){
        new Demo19();
    }
}