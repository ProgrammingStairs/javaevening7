// example showing the concept of Constructor chaining
// this can also be returned from function

class TestMain{
    int num;
    TestMain(int num){
        this.num=num;
    }
    TestMain getThis(){
        return this;
    }
    void printData(){
        System.out.println("Number : "+num);
    }
}
class Demo13{
    public static void main(String args[]){
        TestMain obj = new TestMain(100);
        /*
        TestMain obj1 = obj.getThis();
        obj1.printData();
        */
        obj.getThis().printData();
    }
}
