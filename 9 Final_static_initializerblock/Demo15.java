// example showing the concept of initializer block

class Demo15{
    public static void main(String args[]){
        int a = 50;
        //normal block
        {
            int b=100;
            a=500;
            System.out.println("inside a : "+a);
            System.out.println("inside b : "+b);
        }
            System.out.println("outside a : "+a);
          
    }
}