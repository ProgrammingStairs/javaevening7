// example
import java.util.Scanner;
class Product{
    int pid;
    String name;
    double price;
    
    void getDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Product Id : ");
        pid = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Product Name : ");
        name = sc.nextLine();
        System.out.println("Enter Product Price : ");
        price = sc.nextDouble();
    }
    void display(){
        System.out.println("\nProduct Id : "+pid);
        System.out.println("Product Name : "+name);
        System.out.println("Product Price : "+price);
    }
}
class Demo4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of product : ");
        int num = sc.nextInt();

        Product pobj[] = new Product[num]; // reference array
        for(int i=0;i<pobj.length;i++){
            pobj[i] = new Product();
            pobj[i].getDetails();
        }

        for(Product p : pobj)
        {
            p.display();
        }    
    }
}