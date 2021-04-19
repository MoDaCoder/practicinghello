import java.text.NumberFormat;

public class FormattingNumbers {
    public static void main(String[] args) {
        // CurrencyInstance of NumberFormat stored in variable type of NumberFormat
    //    NumberFormat currency = NumberFormat.getCurrencyInstance();
    //    String result = currency.format(123456789.434);
       String result = NumberFormat.getCurrencyInstance().format(123456789.434);
       System.out.println(result);

       // PercentInstance of NumberFormat stored in variable type of NumberFormat
    //    NumberFormat percent = NumberFormat.getPercentInstance();
    //    String result2 = percent.format(1123.145);
       String result2 = NumberFormat.getPercentInstance().format(1123.145);
       System.out.println(result2);

       
    }
}

// NumberFormat is an abstract Class, in Java there is the concept of abstract classes, so some classes are abstract
// They are like a half baked cake, the "new" method can not be used to make an instance of it
// NumberFormat class with java text used to handle java text, numbers, dates ect.

// getCurrencyInstance method creates an instance of the number format class and returns it(can be reffered to as a factory method)
// That instance value can be stored in a variable type called NumberFormat