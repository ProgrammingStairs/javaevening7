// example showing the concept of method overriding

class Parent{
    void show(){
        System.out.println("Its a shape");
    }
}
class Circle extends Parent{
    @Override
    void show(){
        System.out.println("Its a Circle shape");
    }
}
class Rectangle extends Parent{
    @Override
    void show(){
        System.out.println("Its a Rectangle shape");
    }
}
class Square extends Parent{}

class Demo15{
    public static void main(String args[]){
        Parent pobj;
            pobj = new Circle();
            pobj.show();

            pobj = new Rectangle();
            pobj.show();

            pobj = new Square();
            pobj.show();
    }
}