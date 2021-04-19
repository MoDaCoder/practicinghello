public class MathClass {
    public static void main(String[] args) {
        int result = Math.round(1.1F);
        System.out.println(result);
        
        double result2 = Math.ceil(1.1F);
        System.out.println(result2);

        double result3 = Math.floor(1.1F);
        System.out.println(result3);

        int result4 = Math.max(1, 2);
        System.out.println(result4);

        int result5 = (int) Math.round(Math.random() * 100);
        System.out.println(result5);

        int result6 = (int) (Math.random() * 100);
        System.out.println(result6);
    }
}

// The Math class has a lot of useful methods(ex. round, ceiling, random)