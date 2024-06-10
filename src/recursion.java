public class recursion {
    public static void main(String[] args) {
//        walk(5);
//        System.out.println(factorial(7));
        System.out.println(power(2, 8));
    }

    private static int power(int base, int exponent) {
        if(exponent < 1)return 1;

        return base * power(base, exponent -1);

    }

//    private static int factorial(int number) {
//
//        if (number < 1)return 1;
//        return number * factorial(number -1);
//    }

//    private static void walk(int steps) {
//
//        if (steps < 1)return;
//        System.out.println("You take a Step");
//        walk(steps-1);
//
//
//    }
}
