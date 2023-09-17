public class DotOperator {
    public static void main(String[] args) {

       StudentData student1= new StudentData ();//create object
        student1.rollno=79;//insert value to objext
        student1.marks=67.4;
        student1.name="Md Huzaifa Ansari";
        System.out.println(student1.name);
        System.out.println(student1.rollno);
        System.out.println(student1.marks);

    }
}
class StudentData{
    int rollno;//instance variable
    double marks;
    String name;
}
