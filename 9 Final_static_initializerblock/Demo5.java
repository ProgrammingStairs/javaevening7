// example showing the concept of final keyword

class Demo5{
    public static void main(String args[]){
        final int arr[] = {1,2,3,4,5};
        int arr1[] = {11,22,33,44,55};
        arr1 = arr;
        for(int element : arr1)         
            System.out.print(element+" ");
    }
}