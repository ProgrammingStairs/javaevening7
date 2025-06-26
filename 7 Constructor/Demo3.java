// example showing the concept of Constructor

class Demo3{
    // constructor
    Demo3(){
        int rno=100;
        double per = 34.43;
        String name = "Andrew Anderson";
      
        System.out.println("Default Constructor called");
        System.out.println("Name : "+name);
        System.out.println("Roll Number : "+rno);
        System.out.println("Percentage : "+per);
    }
    public static void main(String args[]){
        Demo3 obj = new Demo3();
    }
}

// // example showing the concept of Constructor

// class Demo3{
//     // constructor
//     Demo3(){
//         System.out.println("Default Constructor called");
//     }
//     public static void main(String args[]){
//         Demo3 obj[] = new Demo3[3];
//         obj[0] = new Demo3();
//     }
// }