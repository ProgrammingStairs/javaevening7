// program showing the concept of switch control statement
// error in output
class Demo11{
    public static void main(String args[]){
        switch('a'){
            case 97 : System.out.println("statement 1");
                        break;
            case 'a' : System.out.println("statement 2");
                        break;
            default : System.out.println("Invalid statement");
                        break;
        }
    }
}