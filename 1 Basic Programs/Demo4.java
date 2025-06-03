// program 

class Demo4{
    public static void main(String args[]){
        int num1 = 012;
        System.out.println("Result : "+num1);

        int num2 = 0x12;
        System.out.println("Result : "+num2);

        int num3 = 0xa12;
        System.out.println("Result : "+num3);

    }
}
/*
    012 = octal(0-7) number system

    1 x 8 ^ 1 + 2 x 8 ^ 0
    1 x 8 + 2 x 1
    8 + 2 = 10

    0x12 = hexadecimal(0-15) number system

    1 x 16 ^ 1 + 2 x 16 ^ 0
    1 x 16 + 2 x 1
    16 + 2 = 18

    0xa12 = hexadecimal(0-15) number system
            0   1   2   3   4   5   6   7   8   9   a   b   c   d   e   f
                                                    10  11  12  13  14  15
    a x 16^2 + 1 x 16 ^ 1 + 2 x 16 ^ 0
    10 x 256 + 1 x 16 + 2 x 1
    2560 + 16 + 2
    2560 + 18 
    2578
*/ 