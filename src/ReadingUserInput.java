import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // println returns a new line
        // To stop that just use print
        System.out.print("Age: ");
        byte age = scanner.nextByte();
        System.out.println("Your Age: " +age);

        Scanner ss = new Scanner(System.in);
        System.out.print("Name: ");
        String name = ss.nextLine().trim();
        System.out.println("Your Name: " +name);
    }
}

// Scanner is a java.util package so it has to be imported from java.util

// System.in and System.out are some of the fields in the system class and is like a variable that is defined in a class
// System.in used to take in input data

// To use Scanner you first have to declare the Scanner class and set the variable name to store new Scanner(System.in)
// Then go ahead and set the System.out.print and the input fields you choose for the user (ex. syout.print("Age: "))
// Then set whatever value to whatever variable (ex. byte age = ect.) and set it to store the ScannerVariable.nextToken (ex. scanner.nextByte)

// Full example: Scanner scanner = new Scanner(System.in); byte age = scanner.nextByte(); System.out.println("You are " +age);

//***NOTE: I do not know if it is best practice to use two Scanners. But as of 4/20/21 I don't know a better way.***