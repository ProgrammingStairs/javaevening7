// example showing the concept of function

class Demo4{
    void display(){
        System.out.println("display method called");
    }
    void show(){
        System.out.println("show method called");
    }
    public static void main(String args[]){
        Demo4 obj = new Demo4();
        obj.display();
        obj.show();
    }
}