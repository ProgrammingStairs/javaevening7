// example showing the concept of initializer block

class Demo18{
    static{
        System.out.println("static block");
    }
    {
        System.out.println("initializer block");
    }    
    Demo18(){
        System.out.println("constructor");
    }
    public static void main(String args[]){
        new Demo18();
        System.out.println("Main Method");
    }
}