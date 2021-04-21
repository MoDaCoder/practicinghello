import java.util.Scanner;

public class BreakAndContinue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = "";
        while (true) {
            System.out.print("Input: ");
            input = sc.next().toLowerCase();
            if (input.equals("pass"))
                continue;
            if (input.equals("quit"))
                break;
            System.out.println(input);
        }
        sc.close();
    }
}

// Java Continue Statement is used to move control to the beginning of a loop
// Executing the continue statement moves you to the start of a loop 

// Java Break Statement is used to break loop or switch statement
// Executing the break statement breaks you out of the loop terminating the loop right there

// If your using while true you want to make sure you have a break in your loop