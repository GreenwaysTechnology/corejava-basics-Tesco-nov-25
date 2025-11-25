public class DoWhile {
    public static void main(String[] args) {
        int attempts = 1;
        do {
            System.out.println("Trying to open door");
            attempts++;
        } while (attempts <= 3);
    }
}
