public class EscapeSequences {
    public static void main(String[] args){
        // Creating a string with double quotes in it.
        String message = "Hello \"Mo\"";
        System.out.println(message);

        // Practicing Escape Sequences
        // To escape a backslash add another backslash to escape
        // Result, console will print out only one backslash
        String directory = "PS C:\\Users\\gmartinez\\Desktop\\Java Practice\\com.practicinghello";
        System.out.println(directory);

        // Use backslash n to add a new line to the string
        String newline = "Dear Mo, \n How have you been? \nFrom Mo.";
        System.out.println(newline);

        // Use backslack t to create a tab indented space
        String tabbed = "Hello...\t World!";
        System.out.println(tabbed);
    }
}

// Adding special characters like tabs, new line, backslash or double quotes

// To escape a backslash (ex. print out Users\Desktop\Java Practice) use a second back slash

// To add a new line (basically return key) use backslash n (ex. \n)

// To tab space (basically the tab button) use backslash t (ex. \t)
