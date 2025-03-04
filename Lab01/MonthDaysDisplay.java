import java.util.Scanner;

public class MonthDaysDisplay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month;
        int year;

        while (true) {
            System.out.println("Nhap thang: ");
            month = scanner.next();
            System.out.println("Nhap nam: ");

            if (scanner.hasNextInt()) {
                year = scanner.nextInt();
                if (year < 0) {
                    System.out.println("Nam khong hop le, nhap lai.");
                    scanner.nextLine(); // Clear buffer
                    continue;
                }
            } else {
                System.out.println("Nam khong hop le, nhap lai.");
                scanner.next(); // Clear invalid input
                continue;
            }

            int days = getDaysInMonth(month, year);
            if (days == -1) {
                System.out.println("Thang khong hop le, nhap lại.");
            } else {
                System.out.println("So ngay trong thang: " + days);
                break;
            }
        }
        scanner.close();
    }

    public static int getDaysInMonth(String month, int year) {
        month = month.toLowerCase();
        switch (month) {
            case "1": case "january": case "jan.": case "jan":
                return 31;
            case "2": case "february": case "feb.": case "feb":
                return (isLeapYear(year) ? 29 : 28);
            case "3": case "march": case "mar.": case "mar":
                return 31;
            case "4": case "april": case "apr.": case "apr":
                return 30;
            case "5": case "may":
                return 31;
            case "6": case "june": case "jun.": case "jun":
                return 30;
            case "7": case "july": case "jul.": case "jul":
                return 31;
            case "8": case "august": case "aug.": case "aug":
                return 31;
            case "9": case "september": case "sep.": case "sep":
                return 30;
            case "10": case "october": case "oct.": case "oct":
                return 31;
            case "11": case "november": case "nov.": case "nov":
                return 30;
            case "12": case "december": case "dec.": case "dec":
                return 31;
            default:
                return -1;
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
} 
