// example showing the concept of static keyword

class Demo7{
    static{
        System.out.println("static block executes 1 ");
    }
    public static void main(String args[]){
        System.out.println("Inside main method");
    }
    static{
        System.out.println("static block executes 2 ");
    }
}