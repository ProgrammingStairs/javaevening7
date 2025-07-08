// example showing the concept of final keyword

class Demo2{
    int a;
    final int b;
    Demo2(){
        b = 200;
    }
    public static void main(String args[]){
        Demo2 obj = new Demo2();
        System.out.println("value of a : "+obj.a);
        System.out.println("value of b : "+obj.b);
    }
}