// example to add two 2d array
import java.util.Scanner;
class Demo17{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and columns : ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int arr1[][] = new int[rows][cols];
        int arr2[][] = new int[rows][cols];
        int arr3[][] = new int[rows][cols];

        System.out.println("Enter array elements of first array : ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter array elements of second array : ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr2[i][j] = sc.nextInt();
            }
        }

        System.out.println("Array elements of first array are : ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(arr1[i][j]+"\t");
            }
            System.out.println();
        }

        System.out.println("Array elements of second array are : ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(arr2[i][j]+"\t");
            }
            System.out.println();
        }

       System.out.println("Resultant Array elements  are : ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr3[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(arr3[i][j]+"\t");
            }
            System.out.println();
        }


    }
}