// Example showing the concept of Array

import java.util.Scanner;
class Demo4{
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
        int min = arr[0];
        int max = arr[0];
         for(int i = 0;i<arr.length ;i++){
            System.out.print("\t"+arr[i]);
            if(min>arr[i])
                min = arr[i];
            if(max<arr[i])
                max = arr[i];
        }     
            System.out.println("\nMinimum element : "+min);
            System.out.println("\nMaximum element : "+max);

    }
}

