// program showing the concept of primitive type casting

class Demo11{
    public static void main(String args[]){
        // byte a = 5;
        // byte b = 6;

        byte a = 65;
        byte b = 65;
        int c = a+b;
        System.out.println("c : "+c);
        byte d = (byte)(a+b);
        System.out.println("d : "+d);

    }
}

