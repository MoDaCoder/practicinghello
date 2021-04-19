public class StringsWithJava {
    public static void main(String[] args){
        // Long vs ShortHand ex.
        // String message = new String("Hello Mo")
        String message = "Hello Mo ";
        String greeting = "How are you today?";

        // Concatenating two strings
        System.out.println(message+greeting);
        // Or
        String aj = "Hey bro " + "Give me your jacket, I'm Freezing";
        System.out.println(aj);

        // Using String members and methods with . operator
        // For ex.
        System.out.println(message+greeting.endsWith("?"));
        System.out.println(message+greeting.startsWith("?"));
        System.out.println(message+greeting.length());
        System.out.println(message+greeting.indexOf("a"));
        System.out.println(message+greeting.replace("a", "o"));
        System.out.println(message+greeting.toLowerCase());
        System.out.println(message+greeting.toUpperCase());
        System.out.println(message+greeting.trim());
    }
}

// There is the long way of writing a string (reference type) in Java
// And there is a shorthand way by writing it as a string literal
// Although it looks like a primitive type, it is not. Strings in 
// Java are reference types.

// Since String is a class it has members we can access through the . operator
// Using those members we can access all of the methods that come with it

// Strings in Java are immutable (They can not be modified ever)
// Any method that mutates a string will always return a NEW string object