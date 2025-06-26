// example showing the concept of Constructor

class Demo1{
    // constructor
    Demo1(){
        System.out.println("Constructor called");
    }
    public static void main(String args[]){
        new Demo1(); // anonymous object
        new Demo1();// anonymous object
        new Demo1();// anonymous object
    }
}