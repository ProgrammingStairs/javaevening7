// program showing the concept of conditional operator

class Demo5{
    public static void main(String args[]){
        int a = 10 , b = 10;
        // String str = ( a > b ) ? a+" is greater" : b+" is greater";
        // System.out.println(str);

        String str = ( a == b ) ? "Both are equal" : ( ( a > b ) ? a+" is greater" : b+" is greater" );
        System.out.println(str);

    }
}
