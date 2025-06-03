// program showing the concept of nested loop
class Demo6{
    public static void main(String args[]){
        for(int i=1;i<=3;i++){
            System.out.println("i : "+i);
            for(int j=1;j<=3;j++){
                if(i==2 && j==2)
                    // break;
                    // continue;
                    System.exit(0);
                System.out.println("\tj : "+j);
            }
        }
   }
}