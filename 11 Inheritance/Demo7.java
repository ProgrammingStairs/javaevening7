// example showing the concept of Hierarchical Inheritance

import java.util.Scanner;
class Person{
    int age;
    String name;

    void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name : ");
        name = sc.nextLine();

        System.out.println("Enter age : ");
        age = sc.nextInt();
    }
    void showData(){
        System.out.println("\nName : "+name);
        System.out.println("Age : "+age);
    }
}
class Student extends Person{
    int fees;
    String course;

    void getStudData(){
        getData();
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter Course name : ");
        course = sc.nextLine();

        System.out.println("Enter Fees : ");
        fees = sc.nextInt();
    }
    void showStudData(){
        showData();
        System.out.println("Course Name : "+course);
        System.out.println("Fees : "+fees);
    }
}
class Employee extends Person{
    int salary;
    String desig;

    void getEmpData(){
        getData();
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter designation : ");
        desig = sc.nextLine();

        System.out.println("Enter Salary : ");
        salary = sc.nextInt();
    }
    void showEmpData(){
        showData();
        System.out.println("Designation : "+desig);
        System.out.println("Salary : "+salary);
    }
}

class Demo7{
    public static void main(String args[]){
        Employee emp = new Employee();
        Student stud = new Student();

            emp.getEmpData();
            stud.getStudData();

            emp.showEmpData();
            stud.showStudData();

    }
}

