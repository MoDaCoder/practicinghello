import java.util.Date;

public class ReferenceTypes {
    public static void main(String[] args) {
        byte age = 25;
        Date now = new Date();
        System.out.println(now);
        System.out.println(age);
    }
}

// Primitive types dont have members
// Reference types have members

// System is a Java class so we can use . notation to access it's members 
// out is a field and type the out field is PrintStream which is another class
// Since PrintStream is class we can use . notation to access it's members
// println function is a member of the PrintStream class

// YOU CAN JUST TYPE sysout and press tab to get System.out.println();