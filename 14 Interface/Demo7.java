// example showing the concept of anonymous class

// interface Showable{
//     int a=100;
// }
// class Demo7 implements Showable{
//     public static void main(String args[]){
//        System.out.println("value of a : "+a);
//     }
// }

interface Showable{
    int a=100;
}
interface Movable{
    int a=200;
}

class Demo7{
    public static void main(String args[]){
       System.out.println("value of a : "+Showable.a);
       System.out.println("value of a : "+Movable.a);
    }
}