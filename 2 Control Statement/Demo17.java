// program showing the concept of switch control statement
import java.util.Scanner;
class Demo17{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter color : ");
        String color = sc.next().toLowerCase();
        switch(color){
            case "red" :  System.out.println("Red color");
                        break;
            case "green" :  System.out.println("Green color");
                        break;
            case "blue" :  System.out.println("Blue color");
                        break;
            case "purple" : System.out.println("Purple color");
                        break;
            default : System.out.println("Invalid selection");
                        break;
        }
    }
}
