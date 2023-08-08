
/*Write a java program that accepts user name and password and throws and exception "invalid login" if they do not match  */
import java.io.*;
import java.util.*;

class MyException extends Exception {
    public MyException(String msg) {
        super(msg);
    }
}

public class InvalidLogin {
    public static void main(String[] args) throws Exception {

        InvalidLogin a = new InvalidLogin();
        a.myMethod();
    }

    void myMethod() throws MyException {
        String username, password;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter User Name: ");
        username = input.nextLine();
        System.out.println("Enter Password: ");
        password = input.nextLine();
        if (username.equals(password)) {
            System.out.println("Successful Login");
        } else {
            throw new MyException("Invalid Login");
        }
    }
}