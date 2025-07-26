// example showing the concept of abstract class 

import java.util.Scanner;
abstract class RBI{
    RBI(){
        System.out.println("=====Welcome to Bank=====");
    }
    double finalSum(int bal,double rate){
        return bal+bal*rate/100;
    }
    abstract double rate(); 
}
class SBI extends RBI{
    @Override 
    double rate(){
        return 1.234;
    }
}
class BOI extends RBI{
    @Override 
    double rate(){
        return 2.32;
    }
}

class Demo3{
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter Balance : ");
     int bal = sc.nextInt();

     RBI obj;
        obj = new SBI();
        System.out.println("Rate of interest by SBI : "+obj.rate()); 
        System.out.println("Amount by SBI : "+obj.finalSum(bal,obj.rate())); 

        obj = new BOI(); 
        System.out.println("Rate of interest by BOI : "+obj.rate()); 
        System.out.println("Amount by BOI : "+obj.finalSum(bal,obj.rate())); 
    }
}