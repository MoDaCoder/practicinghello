public class SwitchStatements {
    public static void main(String[] args) {
        String role = "admin";
        int placement = 1;

        switch (role) {
            case "admin":
                System.out.println("You're an admin");
                break;

            case "moderator":
                System.out.println("You're an moderator");
                break;

            default:
                System.out.println("You're a guest");
        }

        switch (placement) {
            case 1:
                System.out.println("You're an admin");
                break;

            case 2:
                System.out.println("You're an moderator");
                break;

            default:
                System.out.println("You're a guest");
        }

        if (role == "admin")
            System.out.println("You're an admin");
        else if (role == "moderator")
            System.out.println("You're a moderator");
        else
            System.out.println("You're a guest");
    }
}

// We use the three different switch statements in Java to execute different parts of code
// Depending on the value of an expression

// You can write it in if else statements or use Case statements which can look cleaner and easier to read

// If switch statement is a string the case will be written as a string

// If the switch statement is a short, byte, integer the case will be written as a number