package learn.java.string;
class Student
{
    int rollNo;
    String name;
    int marks;
}
public class intro
{

    public static void main(String[] args)
    {
        Student s1 = new Student();
        s1.name="Swetha";
        s1.rollNo=1;
        s1.marks=99;

        Student s2 = new Student();
        s2.name="Nagarajan";
        s2.rollNo=2;
        s2.marks=100;

        Student s3 = new Student();
        s3.name="Kavitha";
        s3.rollNo=3;
        s3.marks=100;

        Student student[] = new Student[3];
        student[0]=s1;
        student[1]=s2;
        student[2]=s3;

        for (Student value : student) {
            System.out.println(value.name + " : " + value.marks);
        }


    }
}
