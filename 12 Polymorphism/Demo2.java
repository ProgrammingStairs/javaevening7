// example showing the concept of Constructor Overloading 
class Demo2{
    Demo2(int a,int b){
        int res = a>b ? a : b;
        System.out.println("Greater Number : "+res);
    } 
    Demo2(int a,int b, int c){
        int res = a>b ? (a>c ? a : c) : (b>c? b : c);
        System.out.println("Greater Number : "+res);
    } 
    public static void main(String args[]){
        new Demo2(45,56);
        new Demo2(56,67,73);
    }
}