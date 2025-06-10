// Example to check whether entered array is palindrome or not
import java.util.Scanner;
class Demo10{
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
         int i;  
         for(i=0;i<size/2;i++){
            if(arr[i] != arr[size-1-i])
                break;
         }
         if(i==size/2)
             System.out.println("\nArray is palindrome");
         else 
             System.out.println("\nArray is not palindrome");
    }
}

