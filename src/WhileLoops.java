import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
        int i = 5;
        while (i > 0) {
            System.out.println("Hello Mo" + i);
            i--;
        }

        int q = 0;
        while (q < 5) {
            System.out.println(q);
            q++;
        }

        Scanner sc = new Scanner(System.in);
        String input = "";
        while (!input.equals("quit")) {
            System.out.print("Input: ");
            input = sc.next().toLowerCase();
            System.out.println(input);
        }
        sc.close();
    }
}

// A while loop basically has the same functionality as a for loop

// First theres the while with parentheses 
// Then loop condition (boolean)
// Then the code block is executed
// Lastly the loop counter is incremented

// Differences between while and for loop:
// for loop is used when we know the number of iterations (if the condition is not put up in for loop, it'll iterate infinitely)
// while loop is used only when the number of iterations aren't exactly known (if the condition is not put up in while loop, it provides a compilation error)

// Since we can not use comparison operators between reference types
// We have to use the equals method of String objects

// If you use a scanner in your loop it's best to use define it outside of your loop so it is not recreated multiple times and waste memory
// Always use for best practices