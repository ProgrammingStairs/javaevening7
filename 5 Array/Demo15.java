// example showing the concept of 2d array
import java.util.Scanner;
class Demo15{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and columns : ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int arr[][] = new int[rows][cols];
        System.out.println("Enter array elements : ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Array elements are : ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("Sum : "+(arr[0][0]+arr[0][cols-1]+arr[rows-1][0]+arr[rows-1][cols-1]));

        System.out.println("Array elements are : ");
        for(int ar[] : arr){
            for(int element : ar){
                System.out.print(element+"\t");
            }
            System.out.println();
        }

    }
}