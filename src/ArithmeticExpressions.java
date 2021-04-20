public class ArithmeticExpressions {
    public static void main(String[] args) {
        // Addition
        int aresult = 10 + 3;
        System.out.println(aresult);

        // Subtraction
        int sresults = 10 - 3;
        System.out.println(sresults);

        // Multiplication
        int mresults = 10 * 3;
        System.out.println(mresults);

        // Division
        // Division will produce a whole number regardless of arguments
        int dresult = 10 / 3;
        System.out.println(dresult);

        // Division *Double
        double ddresult = (double)10 / (double)3;
        System.out.println(ddresult);

        // Division *Floating
        float dfresult = 10F / 3F;
        System.out.println(dfresult);

        // Incrementing
        int x = 1;
        x++;
        ++x;
        System.out.println(x);

        // Incrementing Postfix
        // Since a is a postfix, on line 37 a is 5 and is copied on to b as 5 then incremented second and printed as 6, 5
        int a = 5;
        int b = a++; //Postfix
        System.out.println(a);
        System.out.println(b);

        // Incrementing Prefix
        // Since c is Prefix, on line 44 c is incremented first and is copied on to d as 6 and is also printed out as 6 for c
        int c = 5;
        int d = ++c;
        System.out.println(c);
        System.out.println(d);

        // Augmented or Compound assignment operator
        int e = 1;
        // e = e + 2 (Long way)
        e += 2; //(Short hand)
        System.out.println(e);
    }
}

// Arithmetic expressions in Java Addition +, Subtraction -, Multiplication *, Division /, Modular %

// In Java the division of a WHOLE number is a WHOLE number

// To get a floating point number you have to turn your variable numbers in to a float or double

// A float (ex. double ddresult = (double)10 / (double)3;)

// A double (ex. float dfresult = 10F / 3F;)

// A Incrementing expression(ex. int x = 1; x++;)
// In the Arithmic expression x++; is the post fix and ++x; is the prefix.
// Postfix would go second in an expression
// Prefix would go first in an expression

// Augmented or Compound assignment operator(ex. int x = 1; x += 2;)
// Same Concept for other Augmented or Compounded Arithmic expressions(ex. x -= 2;, x *= 2;, x /= 2;)