import java.util.Scanner;

public class IfStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What's the Temperature today? ");
        Integer temp = sc.nextInt();
        // Integer.toString(temp);

        sc.close();

        if (temp > 30) {
            System.out.println("It's a hot day!");
            System.out.println("Drink water");
        } 
        else if (temp > 20)
            System.out.println("Beautiful day");
        else
            System.out.println("Cold day");
    }
}