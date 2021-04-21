import java.util.Scanner;

public class DoWhileLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = "";
        // while (!input.equals("quit")){
        //     System.out.print("Input: ");
        //     input = sc.next().toLowerCase();
        //     System.out.println(input);
        // }

        do {
            System.out.print("Input: ");
            input = sc.next().toLowerCase();
            System.out.println(input);
        } 
        while (!input.equals("quit"));
        sc.close();
    }
}

// Do while loops are a lot like while loops but with do while loops
// you check the condition last so that means the do-while loops always gets executed at least once

// To write a do-while loop start by writing do with curly brace brackets.
// Inside the brackets you write the block of code
// Then at the end outside of the brackets you write the while condition statement.