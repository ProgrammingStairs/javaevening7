// Example showing the concept of Singleton class
// Lazy initialization 
class Singleton{
    static private Singleton instance;
    private Singleton(){}
    static Singleton getInstance(){
        System.out.println("instance before : "+instance);
        if(instance==null){
             instance = new Singleton();
            System.out.println("instance inside : "+instance);
        }
        System.out.println("instance after : "+instance);
        return instance;
    }
    int a=100;
    static void display(){
        System.out.println("object created : "+instance);
    }
}
class Demo3{
    public static void main(String args[]){
      //  Singleton.display();
       Singleton instance = Singleton.getInstance();
       System.out.println("value of a : "+instance.a);
       instance.a+=100;
       System.out.println("value of a : "+instance.a);
       
       Singleton instanceNew = Singleton.getInstance();
       System.out.println("value of a : "+instanceNew.a);
        
    }
}