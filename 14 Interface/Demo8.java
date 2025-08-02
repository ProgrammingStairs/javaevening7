// example showing the concept of interface 

interface Showable{
    void show();
}
interface Drawable extends Showable{
    void draw();
}
class Demo8 implements Drawable{
    @Override
    public void show(){
        System.out.println("show method called");   
    }
    @Override
    public void draw(){
        System.out.println("draw method called");   
    }
    public static void main(String args[]){
        Drawable obj = new Demo8();
        
        obj.show();
        obj.draw();
    }
}