// example showing the concept of Method Overloading 
class Demo5{
    int greater(int a,int b){
        return a>b ? a : b;
    } 
    double greater(double a,double b){
        return a>b ? a : b;
    } 
    public static void main(String args[]){
        Demo5 obj = new Demo5();
        System.out.println("Greater Number : "+obj.greater(45,56));
        System.out.println("Greater Number : "+obj.greater(5.6,6.7));
    }
}