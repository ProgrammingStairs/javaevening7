// example showing the concept of final keyword

class Demo1{
    public static void main(String args[]){
        final int a = 100;
        // a = 200;
        System.out.println("value of a : "+a);

        final int b;
        b= 200;
        System.out.println("value of b : "+b);
    }
}