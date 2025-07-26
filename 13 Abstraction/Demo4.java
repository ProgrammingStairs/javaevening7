// example showing the concept of abstract class 

import java.util.Scanner;
abstract class Series{
    abstract void series(int num1,int num2);
}
class EvenSeries extends Series{
    @Override
    void series(int num1,int num2){
        System.out.println("Even number series : ");
        for(int i=num1;i<=num2;i++){
            if(i%2==0)
                System.out.print("\t"+i);
        }
    }
}
class OddSeries extends Series{
    @Override
    void series(int num1,int num2){
        System.out.println("\nOdd number series : ");
        for(int i=num1;i<=num2;i++){
            if(i%2!=0)
                System.out.print("\t"+i);
        }
    }
}

class Demo4{
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter two numbers  : ");
     int a = sc.nextInt();
     int b = sc.nextInt();

        Series sobj;
        sobj = new EvenSeries();
        sobj.series(a,b);

        sobj = new OddSeries();
        sobj.series(a,b);
    }
}