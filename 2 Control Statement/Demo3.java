// program showing the conceot of if else statement

import java.util.Scanner;
class Demo3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter salary : ");
        int salary = sc.nextInt();
        System.out.println("Enter experience : ");
        int exp = sc.nextInt();
        
        if(salary>=25000 && exp>=5)
            System.out.println("Eligible to get Hike");
        else
            System.out.println("Not Eligible to get Hike");
    }
}