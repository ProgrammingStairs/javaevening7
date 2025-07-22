// example showing the concept of Method Overloading 
// generates error in output
class Demo6{
    int greater(int a,int b){
        return a>b ? a : b;
    } 
    double greater(int a,int b){
        return a>b ? a : b;
    } 
    public static void main(String args[]){
        Demo6 obj = new Demo6();
        System.out.println("Greater Number : "+obj.greater(45,56));
        System.out.println("Greater Number : "+obj.greater(56,67));
    }
}