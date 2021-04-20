import java.util.Scanner;

public class AMortgageCalculator {
    public static void main(String[] args) {
    //NOTE: Could have saved more memory by converting bytes and integers in to floats and doubles
    //NOTE: But trade off more lines of code
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter Principal: ");
    Float principal = sc.nextFloat();

    System.out.print("Enter Interest Rate: ");
    Float interestrate = sc.nextFloat();
    float r = interestrate / 100F; 

    System.out.print("Enter Period (Years): ");
    Float numberofyears = sc.nextFloat();
    float n = numberofyears * 12;

    double mortgage = principal * (r * Math.pow((1 + r), n) / (Math.pow((1 + r), n) - 1));
    // System.out.println("Your Mortgage is: " +mortgage);
    System.out.printf("Your Mortgage is: %.2f", +mortgage);
    }
}

//Note: Use Math.pow to calculate exponential equations

// Principal: 100000

// Annual Interest Rate: 3.92

// Period (Years): 30

// Mortgage: $472.81

// Equation: M = P * ((r(1+r)**n) / ((1+r)**n - 1))

// r: Annual Interest Rate as a percentage: 0.0392
// n: payment (Years) = 360

// Pseudo Code:
// input principal **
// input interestrate
// input number of years

// Divide interestrate by 100
// Multiply number of years by 12

// Actual Code:

// Scanner scanner0 = new Scanner(System.in);
// System.out.print("Enter Principal: ");
// Float principal = scanner.nextFloat();

// Scanner scanner1 = new Scanner(System.in);
// System.out.print("Enter Interest Rate: ");
// Float interestrate = scanner1.nextFloat();
// float r = interestrate / 100F;

// CAN POSSIBLY USE INT HERE TO SAVE MORE MEMORY BUT HAVE TO CONVERT BACK INTO A FLOAT ON THE NEXT BLOCK OF CODE
// Scanner scanner2 = new Scanner(System.in);
// System.out.print("Enter Period (Years): ");
// Float numberofyears = scanner2.nextFloat();
// float n = numberofyears * 12;

// float mortgage = principal * ((r(1 + r) ** n) / ((1 + r)**n - 1));

// Exponent example: principal * (r * Math.pow((1 + r), n) / (Math.pow((1 + r), n) -1);