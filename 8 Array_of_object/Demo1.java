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
}
class Demo1{
    public static void main(String args[]){
        Product p1 = new Product(101,"Soap",1002.22);
        Product p2 = new Product(102,"Cream",72.22);
        
        System.out.println("Product 1 : \nProduct Id : "+p1.pid);
        System.out.println("Product Name : "+p1.name);
        System.out.println("Product Price : "+p1.price);

        System.out.println("\nProduct 2 : \nProduct Id : "+p2.pid);
        System.out.println("Product Name : "+p2.name);
        System.out.println("Product Price : "+p2.price);
    }
}