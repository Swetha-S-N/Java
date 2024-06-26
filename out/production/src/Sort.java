import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sort 
{
    public static void main(String[] args) 
    {
        // Comparator<Integer> com = new Comparator<Integer>() 
        // {
        //     public int compare(Integer i,Integer j)
        //     {
        //         if(i%10>j%10)
        //         {
        //             return 1;
        //         }
        //         else
        //         {
        //             return -1;
        //         }
        //     }

            
        // };
        // List<Integer> nums = new ArrayList<>();
        // nums.add(43);
        // nums.add(81);
        // nums.add(11);
        // nums.add(20);
        // nums.add(49);
        // Collections.sort(nums,com);
        // System.out.println(nums);

        Comparator<String> comp = new Comparator<String>() 
        {
            public int compare(String n,String m)
            {
                if(n.length()>m.length())
                {
                    return 1;
                }
                else
                {
                    return -1;
                }
            }
            
        };
        
        List<String> names = new ArrayList<>();
        names.add("Swetha");
        names.add("Nagarajan");
        names.add("Kavitha");
        names.add("Raghavan");
        names.add("Southamani");

        System.out.println(names);
        Collections.sort(names,comp);
        System.out.println(names);


        
    }
    
}
