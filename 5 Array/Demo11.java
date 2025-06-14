// Example to arrange array elements in ascending order
// selection sort 
import java.util.Scanner;
class Demo11{
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
        int temp;
        // selection sort logic
        for(int i=0;i<size;i++){
            for(int j = i+1;j<size;j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;   
                }
            }
        }
         System.out.println("\nArray elements in ascending order : ");
         for(int i = 0;i<size ;i++){
            System.out.print("\t"+arr[i]);
         }   
    }
}

