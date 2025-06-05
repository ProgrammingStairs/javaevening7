// example showing the concept of Recursion

import java.util.Scanner;
class Demo18{
    int power(int b,int e){
        if(e==0)
            return 1;
        else
            return b * power(b,e-1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base and exponent : ");
        int b = sc.nextInt();
        int e = sc.nextInt();
        Demo18 obj = new Demo18();
        int res = obj.power(b,e);
        System.out.println("Power : "+res);
    }
}