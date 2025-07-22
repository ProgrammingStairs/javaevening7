// example showing the concept of Method Overloading 
// main method overload
class Demo8{
    public static void main(int age){
        System.out.println("Age : "+age);
    }
    public static void main(String name){
        System.out.println("Name : "+name);
    }
    public static void main(String args[]){
        main(78);
        main("Andrew Anderson");
        System.out.println("data : "+args[0]);
    }
}