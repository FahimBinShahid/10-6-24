import java.util.Scanner;

public class LeapYear {
    public static boolean isLeapYear(int year){
        if(year > 0 && year < 9999){
            return year % 400 == 0 || (year % 100 != 0 && year % 4 == 0);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a year: ");

        int year = scanner.nextInt();

        if(isLeapYear(year)){
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        scanner.close();
    }
}
