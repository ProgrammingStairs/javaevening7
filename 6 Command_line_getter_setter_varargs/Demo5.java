// example without the concept of varargs (Variable arguments)
class Demo5{
    void test(int a,int b){
        System.out.println("a : "+a+"\tb : "+b);
    }
    void test(int a,int b,int c){
        System.out.println("a : "+a+"\tb : "+b+"\tc : "+c);
    }
    void test(int a,int b,int c,int d){
        System.out.println("a : "+a+"\tb : "+b+"\tc : "+c+"\td : "+d);
    }
    void test(int a,int b,int c,int d,int e){
        System.out.println("a : "+a+"\tb : "+b+"\tc : "+c+"\td : "+d+"\te : "+e);
    }
    public static void main(String args[]){
        Demo5 obj = new Demo5();
        obj.test(2,3);
        obj.test(2,3,4);
        obj.test(2,3,5,6);
        obj.test(2,3,6,7,8);
    }
}