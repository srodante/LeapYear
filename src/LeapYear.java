import java.util.Scanner;

public class LeapYear {
    public static void main (String [] args){
        Scanner keybd = new Scanner(System.in);
        int year;
        boolean leapYear;

        do {
            leapYear = false;
            System.out.println("Enter a year to check if it's a leap year. Enter -1 to quit:");
            year = keybd.nextInt();

            if (year > 0) {
                if (year % 400 == 0){
                    leapYear = true;
                }else if (year % 100 == 0){
                    leapYear = false;
                }else if (year % 4 == 0){
                    leapYear = true;
                }
                if (leapYear) {
                    System.out.printf("%d is a leap year\n", year);
                } else {
                    System.out.printf("%d is not a leap year\n", year);
                }
            }
        } while (year != -1);
    }
}
