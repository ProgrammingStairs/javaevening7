// example showing the concept of abstract class 

abstract class RBI{
    abstract double rate(); 
}
class SBI extends RBI{
    @Override 
    double rate(){
        return 1.234;
    }
}
class BOI extends RBI{
    @Override 
    double rate(){
        return 2.32;
    }
}

class Demo2{
    public static void main(String args[]){
     RBI obj;
        obj = new SBI();
        System.out.println("Rate of interest by SBI : "+obj.rate()); 
        obj = new BOI(); 
        System.out.println("Rate of interest by BOI : "+obj.rate()); 
    }
}