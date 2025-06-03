// program showing the concept of switch control statement
class Demo13{
    public static void main(String args[]){
        int num=-57;
        switch(num%2){
            case 0 : System.out.println("even number"); 
                    break;
            default : System.out.println("odd number");
                    break;
        }
    }
}
