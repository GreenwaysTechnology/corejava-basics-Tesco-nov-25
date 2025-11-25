public class TernaryOperator {
    public static void main(String[] args) {
        int age = 16;
        String status = "";
        if (age >= 18) {
            status = "Adult";
        } else {
            status = "Minor";
        }
        System.out.println("Status :" + status);
        //short cut to the above code
        status = (age >= 18) ? "Adult" : "Minor";
        System.out.println("Status :" + status);

    }
}
