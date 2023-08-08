/*Program for Dynamic Binding using Employee and Manager Class */
import java.io.*;

class Employee {
    int id;
    String name;

    void accept() throws IOException {
        BufferedReader br;
        br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Id and Name");
        id = Integer.parseInt(br.readLine());
        name = br.readLine();
    }

    void display() {
        System.out.println("Id = " + id + ", Name = " + name);
    }
}

class Manager extends Employee {
    int salary;

    void accept() throws IOException {
        BufferedReader br;
        br = new BufferedReader(new InputStreamReader(System.in));
        super.accept();
        System.out.println("Enter Salary");
        salary = Integer.parseInt(br.readLine());
    }

    void display() {
        super.display();
        System.out.println("Salary = " + salary);
    }
}

public class DynamicBinding {
    public static void main(String[] args) throws IOException {
        BufferedReader br;
        br = new BufferedReader(new InputStreamReader(System.in));
        Employee[] ref = new Employee[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter 1-Employee, 2-Manager: ");
            int choice = Integer.parseInt(br.readLine());
            if (choice == 1)
                ref[i] = new Employee();
            else
                ref[i] = new Manager();
            ref[i].accept();
        }
        System.out.println("the Object are: ");
        for (int i = 0; i < 5; i++) {
            if (ref[i].getClass().getName().equals("Employee"))
                System.out.println("---- Employee Object");
            else
                System.out.println("---- Manager Object");
            ref[i].display();
        }
    }
}
/*Output
Enter 1-Employee, 2-Manager: 
1
Enter Id and Name
1
Sonu
Enter 1-Employee, 2-Manager: 
2
Enter Id and Name
2 
Monu
Enter Salary
1000
Enter 1-Employee, 2-Manager:
1
Enter Id and Name
3
Prateek
Enter 1-Employee, 2-Manager:
1
Enter Id and Name
4
Rishikesh
Enter 1-Employee, 2-Manager:
2
Enter Id and Name
5
Mangla
Enter Salary
2000
the Object are:
---- Employee Object
Id = 1, Name = Sonu
---- Manager Object
Id = 2, Name = Monu
Salary = 1000
---- Employee Object
Id = 3, Name = Prateek
---- Employee Object
Id = 4, Name = Rishikesh
---- Manager Object
Id = 5, Name = Mangla
Salary = 2000
 */