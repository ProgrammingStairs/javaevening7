// program showing the concept of switch control statement
import java.util.Scanner;
class Demo15{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Select from the Below options : ");
        System.out.println("+ for add");
        System.out.println("- for sub");
        System.out.println("* for mul");
        System.out.println("/ for div");
        System.out.println("% for exit");

        System.out.println("Select Option : ");
        char option = sc.next().charAt(0);
        
        switch(option){
            case '+' : System.out.println("Add : "+(a+b));
                        break;
            case '-' : System.out.println("Sub : "+(a-b));
                        break;
            case '*' : System.out.println("Mul : "+(a*b));
                        break;
            case '/' : System.out.println("Div : "+(a/b));
                        break;
            default : System.out.println("Invalid selection");
                        break;
        }
    }
}
