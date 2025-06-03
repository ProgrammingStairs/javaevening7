// program showing the concept of switch control statement
class Demo10{
    public static void main(String args[]){
        switch(3){
            default : System.out.println("Invalid statement");
            case 6 : System.out.println("statement 1");
            case 10 : System.out.println("statement 2");
            case 3 : System.out.println("statement 3");
            case -7 : System.out.println("statement 4");
        }
    }
}