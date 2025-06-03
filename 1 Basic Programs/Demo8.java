// program to find out area of scalene triangle

class Demo8{
    public static void main(String args[]){
        int a = 10, b= 12, c = 6;
        double s = (a+b+c)/2.0;
        double area = Math.sqrt(s * (s-a) * (s-b) * (s-c));
        System.out.println("area of triangle : "+area);
        System.out.printf("area of triangle : %.2f",area);
    }
}

