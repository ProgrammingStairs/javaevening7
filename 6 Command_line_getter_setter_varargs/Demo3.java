// example showing the concept of command line argument

class Demo3{
    public static void main(String args[]){
        System.out.println("No. of arguments : "+args.length);
        int size = args.length;
        String temp;
        for(int i=0;i<size/2;i++){
            temp = args[i];
            args[i] = args[size-1-i];
            args[size-1-i] = temp;
        }

        System.out.println("\nReverse elements : \n");
        for(String element : args){
            System.out.print(element+"\t");
        }
    }
}