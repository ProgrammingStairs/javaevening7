// example showing the concept of super keyword 

class Parent{
    String name = "Andrew Anderson";
    void showName(){
        System.out.println("Parent Name : "+name);      
    }
}
class Child extends Parent{
    String name = "Peter Parker";
    void showName(){
        System.out.println("Child Name : "+name);      
    }
    void displayName(){
        showName();
        super.showName();
    }
}
class Demo3{
    public static void main(String args[]){
       Child cobj = new Child();
       cobj.displayName();
    }   
}