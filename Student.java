/*program to create objects, demonstrate use of toString and static keywords */
public class Student {
    int rollNumber;
    String name;
    static String classTeacher;

    Student(int r, String n){
        rollNumber = r; name = n;
    }
    static void assignTeacher(String name) {
        classTeacher = name;
    }
    public String toString() {
        return "[" + rollNumber + "," + name + "," + classTeacher + "]";
    }
    public static void main(String[] args) {
        Student s1 = new Student(1,"Sonu");
        Student  s2 = new Student(2,"MOnu");
        Student.assignTeacher("Mangla Maam");
        System.out.println(s1);
        System.out.println(s2);
    }
}
