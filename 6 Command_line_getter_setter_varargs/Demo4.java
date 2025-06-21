// example showing the concept of command line argument
class Demo4{
    String[] getArray(String args[]){
        System.out.println("No. of arguments : "+args.length);
        int size = args.length;
        String temp;
        for(int i=0;i<size/2;i++){
            temp = args[i];
            args[i] = args[size-1-i];
            args[size-1-i] = temp;
        }
        return args;
    }
    public static void main(String args[]){
        Demo4 obj = new Demo4();
        System.out.println("\nReverse elements : \n");
        for(String element : obj.getArray(args)){
            System.out.print(element+"\t");
        }
    }
}