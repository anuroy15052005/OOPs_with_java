public class oops_01{
    public static void main(String[] args) {

        Student stu1 = new Student();

        stu1.rno = 1;
        stu1.name = "Anu";
        stu1.marks = 90;

        System.out.println(stu1.rno);
        System.out.println(stu1.name);
        System.out.println(stu1.marks);
        

    }
    
}
class Student{
    int rno;
    String name;
    float marks;
}