// example showing the concept of static keyword

class Demo9{
    static String name;
    static{
        name = "andrew";
        System.out.println("name : "+name);
    }
    public static void main(String args[]){
        System.out.println("name : "+name);
        System.out.println("name : "+Demo9.name);
    }
}