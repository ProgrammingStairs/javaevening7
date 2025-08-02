// example showing the concept of anonymous class
interface Showable{
    int age=18;
    void getAge();
}
class Demo6{
    public static void main(String args[]){
        // Showable obj = new Showable(){
        //     @Override
        //     public void getAge(){
        //         System.out.println("age : "+age);   
        //     }
        // };
        // obj.getAge();
        new Showable(){
            @Override
            public void getAge(){
                System.out.println("age : "+age);   
            }
        }.getAge();
    }
}