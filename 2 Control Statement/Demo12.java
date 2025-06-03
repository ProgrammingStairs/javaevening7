// program showing the concept of switch control statement
class Demo12{
    public static void main(String args[]){
        int i=1,num=10;
        switch(i++){
            case -2 : num++;
            case 4 : --num;
                        break;
            case 1 : num++; // 10 ---> 11
            case 0 : --num;  // 10
            default : System.out.println("num : "+(num++)); // 10 ----> 11
                        break;
        }
    }
}