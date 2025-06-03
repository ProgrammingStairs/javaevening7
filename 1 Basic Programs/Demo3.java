// program showing the concept of relational operator

class Demo3{
    public static void main(String args[]){
        int num1 = 5, num2 = 2;
        boolean result;

        result = num1 < num2;
        System.out.println(num1+" < "+num2+" = "+result);

        result = num1 > num2;
        System.out.println(num1+" > "+num2+" = "+result);

        result = num1 <= num2;
        System.out.println(num1+" <= "+num2+" = "+result);

        result = num1 >= num2;
        System.out.println(num1+" >= "+num2+" = "+result);

        result = num1 == num2;
        System.out.println(num1+" == "+num2+" = "+result);

        result = num1 != num2;
        System.out.println(num1+" != "+num2+" = "+result);

    }
}