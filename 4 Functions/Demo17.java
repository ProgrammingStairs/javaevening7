// example showing the concept of Recursion

import java.util.Scanner;
class Demo17{
    int fact(int n){
        if(n==0)
            return 1;
        else
            return n * fact(n-1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        Demo17 obj = new Demo17();
        int res = obj.fact(num);
        System.out.println("Factorial : "+res);
    }
}