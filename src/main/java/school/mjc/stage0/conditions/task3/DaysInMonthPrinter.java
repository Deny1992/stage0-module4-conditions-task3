package school.mjc.stage0.conditions.task3;

public class DaysInMonthPrinter {
    public void amountOfDays(int month) {
        int days = switch (month){
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 2 -> 28;
            case 4, 6, 9, 11 -> 30;
            default -> -1;
        };
        if(days < 0){
            System.out.println("wrong number!");
        }else {
            System.out.println(days);
        }
    }
}

