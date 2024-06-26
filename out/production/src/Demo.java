import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Demo 
{
    public static void main(String[] args) 
    {
       Set<Integer> nums = new TreeSet<Integer>();
       nums.add(1);
       nums.add(10);
       nums.add(73);
       nums.add(31);
       nums.add(45);
       nums.add(92);
       nums.add(78);
       nums.add(108);

        Iterator<Integer> values =  nums.iterator();
        System.out.println(values.hasNext());
        while(values.hasNext())
        {
            System.out.println(values.next());
        }

     
    }
    
} 
