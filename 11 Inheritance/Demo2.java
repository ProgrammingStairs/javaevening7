// example showing the concept of super keyword 

class Parent{
    String name = "Andrew Anderson";
}
class Child extends Parent{
    String name = "Peter Parker";
    void displayName(){
        System.out.println("Child Name : "+name);
        System.out.println("Parent Name : "+super.name);
    }
}
class Demo2{
    public static void main(String args[]){
       Child cobj = new Child();
       cobj.displayName();
    }   
}