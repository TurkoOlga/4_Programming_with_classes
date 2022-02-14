package task6;

public class Main {
    public static void main(String[] args) {
        Time secondsAndMinutesTime = new Time(3, 56, 44);
        secondsAndMinutesTime.addSeconds(78);
        secondsAndMinutesTime.addMinutes(554);
        System.out.println(secondsAndMinutesTime);

        Time hourTime = new Time();
        hourTime.setHour(23);
        System.out.println(hourTime);
    }
}
