// example showing the concept of Run time polymorphism
class Demo{
    void display(){
        System.out.println("display method called of parent");
    } 
    void show(){
        System.out.println("show method called of parent");
    } 
}
class Demo14 extends Demo{
    @Override
    public void display(){
        System.out.println("display method called of child");
    } 
    void view(){
        System.out.println("view method called of Child");
    }
    public static void main(String args[]){
        Demo obj = new Demo14(); // upcasting
        obj.display();
        obj.show();
        Demo14 cobj = (Demo14)obj;// downcasting
        cobj.view();
    }
}


// readFile(); // predefined method

// Object object =  obj.readFile();   // return object of user defined class

// Product---> pobj
// Product pobj =  (Product)obj.readFile();

// Student---> sobj 
// Student sobj =  (Student)obj.readFile();

// Employee--> eobj
// Employee eobj = (Employee)obj.readFile();
