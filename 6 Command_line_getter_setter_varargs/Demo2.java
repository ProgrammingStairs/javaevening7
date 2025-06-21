// example showing the concept of command line argument

class Demo2{
    public static void main(String args[]){
        System.out.println("No. of arguments : "+args.length);
        int sum=0;
        for(String str : args){
            sum = sum + Integer.parseInt(str);
        }
        System.out.println("Sum : "+sum);
    }
}