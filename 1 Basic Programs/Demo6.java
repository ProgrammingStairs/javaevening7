// program showing the concept of increment decrement operator

class Demo6{
    public static void main(String args[]){
        int a = 10;
//        int res = a++ + ++a - --a - a-- - --a + ++a;
        //        10  + 12 - 11 - 11 - 9 + 10 
        int res = ++a + a - --a + a++ + --a - --a;
            //    11  + 11 - 10 + 10 + 10 - 9
        System.out.println(res);
    }
}
