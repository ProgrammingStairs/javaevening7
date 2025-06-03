// example showing the concept of function

class Demo5{
    void display(){
        System.out.println("display method called");
        show();
        this.show();
    }
    void show(){
        System.out.println("show method called");
    }
    public static void main(String args[]){
        Demo5 obj = new Demo5();
        obj.display();
    }
}