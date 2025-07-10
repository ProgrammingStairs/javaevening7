// example showing the concept of initializer block

class Demo17{
    static{
        System.out.println("static block");
    }
    {
        System.out.println("initializer block");
    }    
    Demo17(){
        System.out.println("constructor");
    }
    public static void main(String args[]){
        System.out.println("Main Method");
    }
}