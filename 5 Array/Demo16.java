// example showing the concept of 2d array
import java.util.Scanner;
class Demo16{
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

    if(rows==cols){
        int sum=0;
            for(int i=0;i<rows;i++){
                for(int j=0;j<cols;j++){
                    // if(i==j)
                    //     sum = sum + arr[i][j]; 

                    if(i+j==rows-1)
                        sum = sum + arr[i][j];    
                }
            }
        System.out.println("Sum : "+sum);
    }else
        System.out.println("Sum not possible");
    }
}