// example showing the concept of static keyword

class Demo{
    static void show(){
        System.out.println("show method called");
    }
}
class Demo11{
    static void display(){
        System.out.println("display method called");
    }
    public static void main(String args[]){
        Demo11.display();
        display();
        Demo.show();
    }
}