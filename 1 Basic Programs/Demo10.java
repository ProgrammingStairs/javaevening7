// program showing the concept of primitive type casting

class Demo10{
    public static void main(String args[]){
        // implicit type casting
        int a = 100;
        double b = a;
        System.out.println("a : "+a);
        System.out.println("b : "+b);

        // explicit type casting
        double a1 = 100;
        int b1 = (int)a1;
        System.out.println("a1 : "+a1);
        System.out.println("b1 : "+b1);
    }
}

