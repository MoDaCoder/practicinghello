import java.util.Arrays;
public class MultiDimensionalArrays {
    public static void main(String[] args){
        // Two dimensional column row by column
        int[][] numbers = new int[2][3];
        //Initialize the array column and row
        numbers[0][0] = 1;
        System.out.println(Arrays.deepToString(numbers));

        // Three dimensional Array
        int[][][] number3 = new int[3][1][2];
        number3[0][0][0] = 2;
        System.out.println(Arrays.deepToString(number3));

        // Curly Brace Bracket Syntax
        int[][] number2 = {{1,1}, {2,2}};
        System.out.println(Arrays.deepToString(number2));
    }
}

// Remember to use array class methods and members you need to "import java.util.Arrays;"
// To create a multidimensional array use multiple brackets when creating your array variable
// For ex.(int [][] twodimensionalarray = new int[1"column"][2"row"])(int [][][] threedimensionalarray = new int[1"column"][2"row"][3])