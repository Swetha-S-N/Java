import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student 
{
    int age;
    String name;
    
    public Student(int age, String name) 
    {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() 
    {
        return "Student [age=" + age + ", name=" + name + "]";
    }


    // public int compareTo(Student that) {
    //     if(this.age>that.age)
    //             {
    //                 return 1;
    //             }
    //             else
    //             {
    //                 return -1;
    //             }
    // }
}
public class Sort2 
{
    public static void main(String[] args) 
    {
        // Comparator<Student> com = new Comparator<Student>() 
        // {
        //     public int compare(Student i,Student j)
        //     {
        //         if(i.age>j.age)
        //         {
        //             return 1;
        //         }
        //         else
        //         {
        //             return -1;
        //         }
        //     }

            
        // };
        Comparator<Student> com = (i,j) -> i.age>j.age?1:-1;
        List<Student> stud = new ArrayList<>();
        
        stud.add(new Student(12, "Swetha"));
        stud.add(new Student(8, "Nagarajan"));
        stud.add(new Student(6, "Kavitha"));
        stud.add(new Student(18, "Southamani"));
        stud.add(new Student(2, "Raghavan"));
        Collections.sort(stud,com);
        for(Student s:stud)
        {
            System.out.println(s);
        }
        
    }
    
    
}
