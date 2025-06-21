// example showing the concept of varargs (Variable arguments)
class Demo7{
    void test(String name,int...res){
        System.out.print(name+"\t");
        for(int element : res){
            System.out.print("\telement : "+element);
        }
        System.out.println();
    }
    public static void main(String args[]){
        Demo7 obj = new Demo7();
        obj.test("noname",2,3);
        obj.test("noname",2,3,4);
        obj.test("noname",2,3,5,6);
        obj.test("noname",2,3,6,7,8);
    }
}