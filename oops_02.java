public class oops_02{
    public static void main(String[] args) {

        Student stu1 = new Student(1, "Anu", 90);
        Student stu2 = new Student(2, "Ravi", 80);

        
        System.out.println("Roll No: "+stu1.roll+" ,Name: "+stu1.name+" ,Marks: "+stu1.marks);
        System.out.println("Roll No: "+stu2.roll+" ,Name: "+stu2.name+" ,Marks: "+stu2.marks);

    }
    
}
class Student{
    int roll;
    String name;
    double marks;
    
    Student(int roll, String name, double marks){
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }
}