// example showing the concept of shallow copy

/*
    Student ---------> s1, s2

            s1                                   s2
            |-- name  ----- Andrew ----    name --|
            |-- rno   ----- 101  ------     rno --|
            |-- address --- ref  ------ address --|
                      _______|________
                      |              |
                    City          State 
                   Bhopal           MP

    Shallow copy : 
        1. Shallow copy is responsible for copying the values of data members of one object into another object.
        2. For showing the concept of shallow copy, its mandatory to have atleast one of the data member of reference type. 
        3. In case of shallow copy, changes made on one object will reflect on another object.                              
*/

class Address{
    String state,country;
    Address(String state,String country){
        this.state=state;
        this.country=country;
    }
}
class Student{
    int rno;
    String name;
    Address address; // reference type
    
    Student(int rno,String name,Address address){
        this.rno=rno;
        this.name=name;
        this.address=address;
    }
    Student(Student obj){
        rno = obj.rno;
        name = obj.name;
        address = obj.address;
    }
    void display(){
        System.out.println("Roll Number : "+rno);
        System.out.println("Name : "+name);
        System.out.println("State : "+address.state);
        System.out.println("Country : "+address.country);
    }   
    public static void main(String args[]){
        Address address = new Address("MP","India");
        Student s1 = new Student(101,"Andrew Anderson",address);
        Student s2 = new Student(s1);

        s2.address.state="New York";
        s2.address.country="USA";

        System.out.println("Student 1 : ");
        s1.display();
        System.out.println("\nStudent 2 : ");
        s2.display();
    }
}