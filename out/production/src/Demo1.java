import java.util.HashMap;
import java.util.Map;

public class Demo1 
{
    public static void main(String[] args) 
    {
        Map<String,Integer> students = new HashMap<>();
        students.put("Swetha", 33);
        students.put("Nagarajan", 23);
        students.put("Kavitha", 31);
        students.put("Raghavan", 55);
        students.put("Swetha",77);
        
        // System.out.println(students);
        // System.out.println(students.get("Swetha"));

        // System.out.println(students.keySet());

        // for(String name: students.keySet())
        // {
        //     System.out.print(name +" : "+ students.get(name));
        // }
        
    
} 
}
