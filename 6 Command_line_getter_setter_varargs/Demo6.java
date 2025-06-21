// example showing the concept of varargs (Variable arguments)
class Demo6{
    void test(int...res){
        for(int element : res){
            System.out.print("\telement : "+element);
        }
        System.out.println();
    }
    public static void main(String args[]){
        Demo6 obj = new Demo6();
        obj.test(2,3);
        obj.test(2,3,4);
        obj.test(2,3,5,6);
        obj.test(2,3,6,7,8);
    }
}