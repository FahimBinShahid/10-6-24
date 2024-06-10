public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        return barking && ((hourOfDay < 8 && hourOfDay >= 0) || hourOfDay == 23);
    }

    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 1));  // true
        System.out.println(shouldWakeUp(false, 2)); // false
        System.out.println(shouldWakeUp(true, 8));  // false
        System.out.println(shouldWakeUp(true, -1)); // false (invalid hour)
    }
}
