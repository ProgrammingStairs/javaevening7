// example showing the concept of command line argument

class Demo1{
    public static void main(String args[]){
        System.out.println("No. of arguments : "+args.length);
        for(String str : args){
            System.out.print(str+"\t");
        }
    }
}