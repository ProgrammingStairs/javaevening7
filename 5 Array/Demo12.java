// Example to search an element from an array
// Linear search
import java.util.Scanner;
class Demo12{
    public static void main(String args[]){
        Scanner sc=  new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter Elements : ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array elements are : ");
         for(int i = 0;i<size ;i++){
            System.out.print("\t"+arr[i]);
         }   
        System.out.println("\nEnter element to be search : ");
        int element = sc.nextInt();
        boolean status = false;  
        for(int i=0;i<size;i++){
            if(element==arr[i]){
                System.out.println("\nElement found at position "+(i+1));
                status = true;
                // break;
            }
        }  
        if(!status)
            System.out.println("Element not found");
    }
}

