// example

class Product{
    int pid;
    String name;
    double price;
    
    Product(int pid,String name,double price){
        this.pid=pid;
        this.name=name;
        this.price=price;
    }

    void display(){
        System.out.println("Product Id : "+pid);
        System.out.println("Product Name : "+name);
        System.out.println("Product Price : "+price);
    }
}
class Demo2{
    public static void main(String args[]){
        Product p1 = new Product(101,"Soap",1002.22);
        Product p2 = new Product(102,"Cream",72.22);
        
        System.out.println("Product 1 : ");
        p1.display();

        System.out.println("\nProduct 2 : ");
        p2.display();
    }
}