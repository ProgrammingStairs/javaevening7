// example showing the concept of Method Overloading 
class Demo3{
    void greater(int a,int b){
        int res = a>b ? a : b;
        System.out.println("Greater Number : "+res);
    } 
    void greater(double a,double b){
        double res = a>b ? a : b;
        System.out.println("Greater Number : "+res);
    } 
    public static void main(String args[]){
        Demo3 obj = new Demo3();
        obj.greater(45,56);
        obj.greater(5.6,6.7);
    }
}