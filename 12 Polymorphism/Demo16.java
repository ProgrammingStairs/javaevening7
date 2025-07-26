// example showing the concept of method overriding

class RBI{
    double rate(){
        return 1.0;
    }
}
class CBI extends RBI{
    @Override
    double rate(){
        return 1.45;
    }
}
class PNB extends RBI{
    @Override
    double rate(){
        return 2.32;
    }
}
class SBI extends RBI{}

class Demo16{
    public static void main(String args[]){
        RBI robj;
            robj = new SBI();
            System.out.println("Rate by SBI : "+robj.rate());

            robj = new PNB();
            System.out.println("Rate by PNB : "+robj.rate());

            robj = new CBI();
            System.out.println("Rate by CBI : "+robj.rate());
    }
}