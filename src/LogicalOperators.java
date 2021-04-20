public class LogicalOperators {
    public static void main(String[] args) {
       int temperature = 12;
       boolean isWarm = temperature > 20 && temperature < 30;
       System.out.println(isWarm);

       boolean hasHighIncome = true;
       boolean hasGoodCredit = true;
       boolean hasCriminalRecord = false;
       boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
       System.out.println(isEligible);


    }
}

// You can declare a boolean variable to write a boolean expression

// Java reads boolean expressions from left to right

// If an expression on one side of the and ( && ) is false the whole expression will return false

// If an expression on one side of the or ( || ) operator is true then the whole expression is true