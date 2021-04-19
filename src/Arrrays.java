import java.util.Arrays;
public class Arrrays {
    public static void main(String[] args){
        // Arrays are Reference Types
        // Always name your variables appropiately
        // If you print out an array in Java you get a string calculated
        // Based on the address of this object in the memory
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        System.out.println(Arrays.toString(numbers));
        numbers[10] = 3;

        // Newer way to initialize arrays if you know the items ahead of time
        // Arrays in Java have a fixed length
        int[] numbers2 = {2,4,5,6,7};
        Arrays.sort(numbers2);
        System.out.println(Arrays.toString(numbers2));
        System.out.println(numbers2.length);
    }
}

// To write an array variable you need int[] and the new method since it is a reference type
// Java will throw "Exceptions" when it is telling you about an error
// To print out an Array in Java you have to use an Array method
// In order to use an Array method you have to import Arrays using java.util.Arrays