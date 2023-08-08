/*Write a Java Program to illustrate multilevel inheritance such that country is inherited from continent state is inherited from country display the place state county and continent */
class continent {
    String continent_nm;

    void getdata1(String a) {
        continent_nm = a;
    }
}

class country extends continent {
    String country_name;

    void getdata2(String b) {
        country_name = b;
    }
}

class state extends country{
String state_name;

void getdata3(String c) {
        state_name = c;
    }

    void display() {
        System.out.println("Continent = " + continent_nm);
        System.out.println("Country = " + country_name);
        System.out.println("State = " + state_name);
    }
}
public class Places 
{
    public static void main(String[] args) 
    {
        state s1 = new state();
        s1.getdata1("Asia");
        s1.getdata2("India");
        s1.getdata3("Maharashtra");
        s1.display();
    }
}
/*
  output
  Continent = Asia
  Country = IndiaState = Maharashtra
 */
