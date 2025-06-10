// Example to reverse individual element of an array
import java.util.Scanner;
class Demo7{
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
         for(int i = 0;i<arr.length ;i++){
            System.out.print("\t"+arr[i]);
         }     
         for(int i=0;i<arr.length;i++){
            int rev = 0;
            while(arr[i]>0){
                int rem = arr[i]%10;
                rev = rev * 10 + rem;
                arr[i] = arr[i]/10;
            }
            arr[i] = rev;
         }
         System.out.println("\nArray individual elements reverse : ");
         for(int i = 0;i<arr.length ;i++){
            System.out.print("\t"+arr[i]);
         }     
    }
}

