package task6;
/*
6. Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае
недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения времени на
заданное количество часов, минут и секунд.
 */

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time() {
    }

    public Time(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public void setHour(int hour) {
        if (hour < 0 || hour > 23) {
            this.hour = 0;
        } else {
            this.hour = hour;
        }
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute > 59) {
            this.minute = 0;
        } else {
            this.minute = minute;
        }
    }

    public void setSecond(int second) {
        if (second < 0 || second > 59) {
            this.second = 0;
        } else {
            this.second = second;
        }
    }

    public void addSeconds(int seconds) {
        second = second + seconds;
        minute = minute + second / 60;
        second = second % 60;
        hour = hour + minute / 60;
        minute = minute % 60;
        hour = hour % 24;
    }

    public void addMinutes(int minutes) {
        addSeconds(minutes * 60);
    }

    public void addHours(int hours) {
        addSeconds(hours * 60 * 60);
    }

    @Override
    public String toString() {
        return String.format("hour:%1$d, minute:%2$d, second:%3$d", hour, minute, second);
    }
}
