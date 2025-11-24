public class ComparsionalOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        boolean resultOne = a == b;
        System.out.println("A and B are equal: " + resultOne);
        boolean resultTwo = a != b;
        System.out.println("A and B are not equal: " + resultTwo);

        boolean resultThree = a > b;
        System.out.println("A is greater than B: " + resultThree);

        boolean resultFour = a < b;
        System.out.println("A is less than B: " + resultFour);

        boolean resultFive = a >= b;
        System.out.println("A is greater than B or equal to: " + resultFive);

        boolean resultSix = a <= b;
        System.out.println("A is lesser  than B or equal to: " + resultSix);

    }
}
