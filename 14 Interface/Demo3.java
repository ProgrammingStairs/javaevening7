// example showing the concept of interface 

@FunctionalInterface
interface Showable{
    void show();
}
class Demo3 implements Showable{
    @Override
    public void show(){
        System.out.println("show method called");   
    }
    public static void main(String args[]){
        Showable obj = new Demo3();
        obj.show();
    }
}