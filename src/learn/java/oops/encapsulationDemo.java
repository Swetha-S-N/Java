package learn.java.oops;

class Human
{
    private int age = 12;
    private  String name = "Swetha";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {

        this.age=age;
    }
}
public class encapsulationDemo
{
    public static void main(String[] args) {
        Human obj = new Human();
        System.out.println("My Name is "+obj.getName()+" I am " +obj.getAge()+" Years Old");
    }
}
