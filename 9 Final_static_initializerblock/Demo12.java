// example showing the concept of static keyword
class Demo12{
    static int count;
    Demo12(){
        count++;
    }
    static int getCount(){
        return count;
    }
    public static void main(String args[]){
        new Demo12();
        new Demo12();
        new Demo12();
        new Demo12();
        new Demo12();
        new Demo12();
        System.out.println("No. of objects created : "+count);
        System.out.println("No. of objects created : "+getCount());
    }
}