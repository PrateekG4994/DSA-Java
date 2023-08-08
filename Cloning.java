/* program on Object Cloning */
import java.util.*;
class Person implements Cloneable
{
    int id;
    String name;
    Date birthDate;
    Person(int i, String n, Date d)
    {
        id = i; name = n; birthDate = d;
    }
    public Person clone() throws CloneNotSupportedException
    {
        Person p = (Person)super.clone();
        p.birthDate = (Date)birthDate.clone();
        return p;
    }
    public String toString()
    {
        return "Id = " + id+ " Name = "+name+" Birthdate = "+birthDate;
    }
}
public class Cloning {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person p = new Person(10,"ABC", new Date());
        Person p1 = p.clone();
        System.out.println(p);
        System.out.println(p1);
        p1.birthDate.setMonth(0);
        System.out.println(p);
        System.out.println(p1);
    }
}
/*Output
Id = 10 Name = ABC Birthdate = Fri Jul 14 22:08:54 IST 2023
Id = 10 Name = ABC Birthdate = Fri Jul 14 22:08:54 IST 2023
Id = 10 Name = ABC Birthdate = Fri Jul 14 22:08:54 IST 2023
Id = 10 Name = ABC Birthdate = Sat Jan 14 22:08:54 IST 2023 
 */