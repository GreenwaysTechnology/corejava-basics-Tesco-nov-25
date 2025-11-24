public class UnaryOperators {
    public static void main(String[] args) {
        int a = 10;
        //First assisment and later increment
        int result = a++;
        System.out.println("result post fix: " + result);
        int b = 10;
        //increment first and assign the incremented value
        int resultTwo = ++b;
        System.out.println("result Pre fix: " + resultTwo);

    }
}
