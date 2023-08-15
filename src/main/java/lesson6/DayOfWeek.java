package lesson6;

public class DayOfWeek {

    public static void main(String[] args) {

        int day = 16;

        switch (day) {

            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("This is not a day of week");
                break;
        }

        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("This is working day");
            case 6, 7 -> System.out.println("This is weekend");
            default -> System.out.println("Nobody knows what is a day today");
        }


    }
}
