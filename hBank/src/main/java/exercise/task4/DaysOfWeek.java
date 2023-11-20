package exercise.task4;

public class DaysOfWeek {
    int dayNumber;

    public String getDayName(int dayNumber) {
        //Variants 1
//        switch (dayNumber) {
//            case 1 -> {
//                return "Monday";
//            }
//            case 2 -> {
//                return "Tuesday";
//            }
//            case 3 -> {
//                return "Wednesday";
//            }
//            case 4 -> {
//                return "Thursday";
//            }
//            case 5 -> {
//                return "Friday";
//            }
//            case 6 -> {
//                return "Saturday";
//            }
//            case 7 -> {
//                return "Sunday";
//            }
//            default -> {
//                return "Unknown";
//            }

        // Gala variants
        return switch (dayNumber) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Unknown";
        };
    }
}
