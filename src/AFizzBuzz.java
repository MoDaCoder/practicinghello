import java.util.Scanner;

public class AFizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter A Number: ");

        int number = sc.nextInt();
        sc.close();

        // if (number % 5 == 0 && number % 3 == 0)
        //     System.out.println("FIZZBUZZ");
        // else if(number % 5 == 0 )
        //     System.out.println("fizz");
        // else if(number % 3 == 0)
        //     System.out.println("buzz");
        // else
        //     System.out.println(number);

            System.out.println(number % 5 == 0 && number % 3 == 0 ? "fizzbuzz" : number % 5 == 0 ? "fizz" : number % 3 == 0 ? "buzz" : number);
    }
}

// RULES:
// Divisible by 5 you get fizz
// Divisible by 3 you get buzz
// Divisible by both 5 and 3 get fizz buzz
// Divisible by neither 5 or 3 get the inputed value

// PSEUDO CODE:
// User input value
// if condition
// if inputed number is divisible by 5 and returns 0 remainder print out fizz
// if inputed number is divisible by 3 and returns 0 remainder print out buzz
// if inputed number is divisible by 5 and 3 and returns 0 remainder print out fizzbuzz
// if inputed number is NOT divisible by 5 or 3 with the remainder returning 0 print out the inputed value

// ACTUAL CODE:
        // if (number % 5 == 0 && number % 3 == 0)
        //     System.out.println("FIZZBUZZ");
        // else if(number % 5 == 0 )
        //     System.out.println("fizz");
        // else if(number % 3 == 0)
        //     System.out.println("buzz");
        // else
        //     System.out.println(number);

        // System.out.println(number % 5 == 0 && number % 3 == 0 ? "fizzbuzz" : number % 5 == 0 ? "fizz" : number % 3 == 0 ? "buzz" : number);

// REFACTORED CODE:
// Can refactor with Switch Statements or maybe Ternary

//NOTE: Switch Statements only take primitive values