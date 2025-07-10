// example showing the concept of static keyword

class Student {
    int rno;
    String name;
    static String cname;
    static java.util.Scanner sc = new java.util.Scanner(System.in);
  
    Student(int rno, String name){
        this.rno=rno;
        this.name=name;
    }
    static void getCollegeName(){
        System.out.println("Enter college name : ");
        cname = sc.nextLine();
    }
    void printData(){
        System.out.println("\n\tName : "+name);
        System.out.println("\tRoll Number : "+rno);
        System.out.println("\tCollege Name : "+cname);
    }
}
class Demo14{
    public static void main(String args[]){
        Student.getCollegeName();
        Student s1 = new Student(101,"Peter Parker");
        Student s2 = new Student(102,"Mathew Math");
        Student s3 = new Student(103,"Andrew Anderson");

        s1.printData();
        s2.printData();
        s3.printData();
        
    }
}