// example showing the concept of Constructor chaining
// this can also be passed as an argument in constructor call
class Test{
    Test(TestMain obj){
        System.out.println("Number : "+obj.num);
    }
}
class TestMain{
    int num;
    TestMain(int num){
        this.num=num;
        Test obj = new Test(this);
    }
}
class Demo12{
    public static void main(String args[]){
        TestMain obj = new TestMain(100);
    }
}
