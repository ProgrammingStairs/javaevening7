// example showing the concept of static keyword


class Demo{
    static{
        System.out.println("static block executes Demo class");
    }
}
class Demo8{
    public static void main(String args[]){
        System.out.println("Inside main method");
        new Demo();
    }
    static{
        System.out.println("static block executes Demo8 class");
    }
}