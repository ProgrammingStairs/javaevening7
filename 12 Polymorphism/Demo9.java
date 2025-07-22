// example showing the concept of Method Overloading 
class Demo{
    void greater(int a,int b){
        int res = a>b ? a : b;
        System.out.println("Greater Number : "+res);
    } 
    void greater(int a,int b, int c){
        int res = a>b ? (a>c ? a : c) : (b>c? b : c);
        System.out.println("Greater Number : "+res);
    } 
}
class Demo9{
    public static void main(String args[]){
        Demo obj = new Demo();
        obj.greater(45,56);
        obj.greater(56,67,73);
    }
}