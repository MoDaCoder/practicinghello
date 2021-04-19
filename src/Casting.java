public class Casting {
    public static void main(String[] args) {
        // Implicit Casting
        // byte > short > int > long > float > double
        short x = 1;
        int y = x + 2;
        System.out.println(y);

        // Floating Number (more bytes)
        // Integer (less bytes)
        double a = 1.1;
        double b = a + 2; // Java turns integer to 2.0 then is added to x
        System.out.println(b);

        // Explicit Casting
        double c = 1.1;
        int d = (int)c + 1;
        System.out.println(d);

        // Wrapper Classes
        String e = "1";
        Integer.parseInt(e);
        Short.parseShort(e);
        Double.parseDouble(e);
        Float.parseFloat(e);
        System.out.println(e);
    }
}

// Implicit Casting can happen when a variable needs to be converted in to the same as another in order to be of the same type and execute the arithemtic expression.
// The value with the smaller amount of bytes can be converted into the the larger value type in needs to be converted into in order to complete the expression.
// Implicit casting happens when were not going to lose data, there is no chance for data loss

// byte > short > int > long > float > double

// Explicit casting has to be done manually and can only be done with compatible types(ex. double c = 1.1; int d = (int)c + 1;)

// Integer is the wrapper class for the int primitive type(other examples are Short, Float, Double and each with their own methods)