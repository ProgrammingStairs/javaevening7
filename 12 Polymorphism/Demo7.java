// example showing the concept of Method Overloading 
class Demo7{
    static final int greater(int a,int b){
        return a>b ? a : b;
    } 
    static final double greater(double a,double b){
        return a>b ? a : b;
    } 
    public static void main(String args[]){
        Demo7 obj = new Demo7();
        System.out.println("Greater Number : "+obj.greater(45,56));
        System.out.println("Greater Number : "+obj.greater(5.6,6.7));
    }
}