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
class Demo3{
    public static void main(String args[]){
        Product pobj[] = new Product[2]; // reference array
        System.out.println("pobj[0] : "+pobj[0]);
        System.out.println("pobj[1] : "+pobj[1]);
        
        pobj[0] = new Product(101,"Soap",1002.22);
        pobj[1] = new Product(102,"Cream",72.22);
        //   Product pobj[] = new Product[2]; // array of object

        // System.out.println("pobj[0] : "+pobj[0]);
        // System.out.println("pobj[1] : "+pobj[1]);

        for(Product p : pobj)
        {
            p.display();
        }    
    }
}