// example showing the concept of Method Overloading 
class Demo4{
    void greater(int a,double b){
        double res = a>b ? a : b;
        System.out.println("Greater Number : "+res);
    } 
    void greater(double a,int b){
        double res = a>b ? a : b;
        System.out.println("Greater Number : "+res);
    } 
    public static void main(String args[]){
        Demo4 obj = new Demo4();
        obj.greater(45,5.6);
        obj.greater(5.6,67);
    }
}