import java.util.Scanner;

public class ParameterizedConstructorExample {

    String firstName;
    String lastName;
    public static void main(String[] args) {
        String fname;
        String lname;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your First Name : ");
            fname = sc.next();
            System.out.println("Enter your Last Name : ");
            lname = sc.next();
        }
        ParameterizedConstructorExample obj = new ParameterizedConstructorExample(fname,lname);
        System.out.println(obj.firstName + " " + obj.lastName);
    }
    
    ParameterizedConstructorExample(String fname, String lname){
 
        this.firstName=fname;
        this.lastName=lname;

    }
}
