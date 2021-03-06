public class SecondsAndMinutesChallenge {

    /*
     * Create a method called getDurationString
     * with 2 parameters, minutes and seconds
     *
     * You should validate that 1st parameter minutes is >=0
     * You should validate that 2nd parameter seconds is >= 0 and <= 59
     *
     * The method should return "Invalid value" in the method
     * if either the above are not true
     *
     * If the parameters are valid then calculate how many hours,
     * minutes and seconds equals the minutes and seconds passed
     * on this method and return that value as string format "XXh YYm ZZs"
     *
     * Create a 2nd method of the same name
     * but with one parameter, seconds
     *
     * Validate that it is >= 0,
     * return "Invalid value" if its not true
     *
     * If it is valid, then calculate how many minutes are in
     * the seconds value and then call the other overloaded method
     * passing the correct minutes and seconds calculated
     * so that it can calculate correctly
     *
     * Call both methods to print values to the console
     *
     * Tips: Use int, 1 min = 60 s, 1 hr = 60 minutes = 3600 s
     */

    public static int getDurationString(int minutes, int seconds) {
        if((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            System.out.println("Invalid Value");
            return -1;
        } else {
            int hours = minutes / 60;
            int remainingMinutes = minutes % 60;
            System.out.println(minutes + "m " + seconds + "s = " + hours + "h " + remainingMinutes + "m " + seconds + "s");
            return remainingMinutes;
        }

    }

    public static int getDurationString(int seconds) {
        if(seconds < 0) {
            System.out.println("Invalid Value");
            return -1;
        } else {
            int minutes = seconds / 60;
            int remainingMinutes = seconds % 60;
            System.out.println(seconds + "s = " + minutes + "m " + remainingMinutes + "s");
            return getDurationString(minutes, remainingMinutes);
        }
    }

}
