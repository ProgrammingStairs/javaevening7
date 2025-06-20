// example showing the concept of multi dimensional array
import java.util.Scanner;
class Demo19{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of 2d array, rows and columns : ");
        int num = sc.nextInt();
        int r = sc.nextInt();
        int c = sc.nextInt();

            int arr[][][] = new int[num][r][c];

        System.out.println("Enter array elements : ");
        for(int i=0;i<num;i++){
            System.out.println("Enter elements for "+(i+1)+" matrix : ");
            for(int j=0;j<r;j++){
                for(int k=0;k<c;k++)
                    arr[i][j][k] = sc.nextInt();
            }
        }
        for(int i=0;i<num;i++){
       System.out.println("Resultant Array elements of "+(i+1)+" matrix is : ");
            for(int j=0;j<r;j++){
                for(int k=0;k<c;k++)
                    System.out.print("\t"+arr[i][j][k]);
                System.out.println();
            }
            System.out.println();
        }

    }
}