// Example to insert an element at specific index
import java.util.Scanner;
class Demo8{
    public static void main(String args[]){
        Scanner sc=  new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = sc.nextInt();
        int arr[] = new int[size+1];
        System.out.println("Enter Elements : ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array elements are : ");
         for(int i = 0;i<size ;i++){
            System.out.print("\t"+arr[i]);
         }     
        System.out.println("\nEnter index : ");
        int index = sc.nextInt();
        System.out.println("Enter element : ");
        int element = sc.nextInt();
        int i;
         for(i=size-1;i>=index;i--){
            arr[i+1] = arr[i];
         }
         arr[index] = element;
         System.out.println("\nArray elements after insertion : ");
         for(int j = 0;j<arr.length ;j++){
            System.out.print("\t"+arr[j]);
         }     
    }
}

