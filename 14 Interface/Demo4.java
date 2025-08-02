// example showing the concept of interface 

interface Showable{
    void show();
}
interface Drawable{
    void draw();
}
class Demo4 implements Showable,Drawable{
    @Override
    public void show(){
        System.out.println("show method called");   
    }
    @Override
    public void draw(){
        System.out.println("draw method called");   
    }
    public static void main(String args[]){
        Showable obj1 = new Demo4();
        Drawable obj2 = new Demo4();
        
        obj1.show();
        obj2.draw();
    }
}