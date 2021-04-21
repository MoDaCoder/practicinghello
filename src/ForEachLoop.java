public class ForEachLoop {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Mango", "Oranges"};

        // FOR LOOPS
        for (int i = 0; i < fruits.length; i++)
            System.out.println(fruits[i]);
        for (int i = fruits.length; i > 0; i--)
            System.out.println(fruits[i]);

        // FOR EACH LOOPS
        for (String fruit : fruits)
            System.out.println(fruit);
    }
}

// Java for-each loop is mainly used to traverse the array or collection elements one by one

// for-each loop limitations is that it always only goes forward
// So a for-each loop can NOT start from the end up to the beginning of an array or collection of items

// The second limitation of for-each loop is that we don't have access to the index of each item
// All there is the loop variable(for (String "loop variable" : fruits)) that holds the value of each item in the arrary or collection of items

// You can start from the end and iterate to the front of an array of items using a regular for loop
// A for loop can access both the index and the actual item in the array or collection of items

// Unless you need to access the index of each item it is much easier to just use the for-each loop