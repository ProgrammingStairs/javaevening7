// example showing the concept of function

class Demo6{
    void display(){
        System.out.println("display method called");
        this.show(this);
    }
    void show(Demo6 x){
        System.out.println("show method called");
        System.out.println("default string representation of object : "+x);
    }
    public static void main(String args[]){
        Demo6 obj = new Demo6();
        obj.display();
    }
}