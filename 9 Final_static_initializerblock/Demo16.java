// example showing the concept of initializer block

class Demo16{
    int b;
    // initializer block
    {
        b=100;
            System.out.println("b : "+b);
    }    
    public static void main(String args[]){
        Demo16 obj = new Demo16();
        System.out.println("b : "+obj.b);
    }
}