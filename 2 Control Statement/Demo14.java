// program showing the concept of switch control statement
import java.util.Scanner;
class Demo14{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Select from the Below options : ");
        System.out.println("1 for add");
        System.out.println("2 for sub");
        System.out.println("3 for mul");
        System.out.println("4 for div");
        System.out.println("5 for exit");

        System.out.println("Select Option : ");
        int option = sc.nextInt();
        
        switch(option){
            case 1 : System.out.println("Add : "+(a+b));
                        break;
            case 2 : System.out.println("Sub : "+(a-b));
                        break;
            case 3 : System.out.println("Mul : "+(a*b));
                        break;
            case 4 : System.out.println("Div : "+(a/b));
                        break;
            default : System.out.println("Invalid selection");
                        break;
        }
    }
}
