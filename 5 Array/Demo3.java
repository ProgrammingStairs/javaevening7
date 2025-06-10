// Example showing the concept of Array

import java.util.Scanner;
class Demo3{
    public static void main(String args[]){
        System.out.println("Enter size of array : ");
        Scanner sc=  new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        
        System.out.println("Enter Elements : ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array elements are : ");
        // for(int element : arr){
        //     System.out.print("\t"+element);
        // }
        int sum=0;
         for(int i = 0;i<arr.length ;i++){
            System.out.print("\t"+arr[i]);
            sum = sum + arr[i];
        }     
            System.out.println("\nsum : "+sum);
    }
}

