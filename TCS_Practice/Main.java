package TCS_Practice;

public class Main {
    public static int countSundays(int n) {
        int fullWeeks = n / 7;
        int extraDays = n % 7;

        if (extraDays > 0) {
            return fullWeeks + 1;
        }
        return fullWeeks;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(countSundays(n));
    }
}