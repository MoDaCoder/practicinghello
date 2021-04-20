public class TernaryOperator {
    public static void main(String[] args) {
        int income = 120_000;
        String className = income > 100_000 ? "First" : "Economy";
        System.out.println(className);
    }
}

// Best practice to try and use comparison, logical, and ternary operators before using if and else statements to keep code clean.