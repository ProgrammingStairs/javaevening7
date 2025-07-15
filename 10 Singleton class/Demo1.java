// Example showing the concept of Singleton class
// Eager initialization
class Singleton{
    static private final Singleton instance = new Singleton();
    private Singleton(){}
    static Singleton getInstance(){
        return instance;
    }
    int a=100;
    static void display(){
        System.out.println("object created : "+instance);
    }
}
class Demo1{
    public static void main(String args[]){
        Singleton.display();
    //    Singleton instance = Singleton.getInstance();
    //    System.out.println("value of a : "+instance.a);
    //    instance.a+=100;
    //    System.out.println("value of a : "+instance.a);
       
    //    Singleton instanceNew = Singleton.getInstance();
    //    System.out.println("value of a : "+instanceNew.a);
        
    }
}