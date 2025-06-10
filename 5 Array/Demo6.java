// Example count even odd and zero
import java.util.Scanner;
class Demo5{
    public static void main(String args[]){
        System.out.println("Enter size of array : ");
        Scanner sc=  new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        int even = 0, odd = 0, zero = 0;
        System.out.println("Enter Elements : ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array elements are : ");
         for(int i = 0;i<arr.length ;i++){
            if(arr[i]==0)
                zero++;
            else if(arr[i]%2==0)
                even++;
            else if(arr[i]%2!=0)
                odd++;
            System.out.print("\t"+arr[i]);
         }     
        System.out.println("\nEven : "+even+"\nOdd : "+odd+"\nZero : "+zero);
    }
}

