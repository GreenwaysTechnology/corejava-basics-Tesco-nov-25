public class LogicalOperators {
    public static void main(String[] args) {
        int age = 25;
        boolean hasId = true;
        // eligbility test
        boolean isAllowed = age >= 18 && hasId;
        System.out.println("isAllowed :" + isAllowed);
        //or
        boolean isHoliday = false;
        boolean isSunday = true;
        boolean todayDay = isHoliday || isSunday;
        System.out.println("Today : " + todayDay);

        //!
        boolean isRaining = false;
        boolean result = !isRaining;
        System.out.println("Can i go outside :" + result);

        //combine logical operators
        int newAge = 20;
        boolean hasLicense = true;
        boolean hasCar = false;
        boolean canDrive = (newAge >= 18 && hasLicense) || hasCar;
        System.out.println("Can Drive :" + canDrive);

    }
}
