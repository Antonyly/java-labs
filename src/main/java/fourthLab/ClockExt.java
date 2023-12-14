package fourthLab;

public class ClockExt {
    private int hours;
    private int minutes;
    private int seconds;
    private int milliseconds;

    // Конструктор для введення даних
    public ClockExt(int hours, int minutes, int seconds, int milliseconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        this.milliseconds = milliseconds;
    }

    // Методи get/set
    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int getMilliseconds() {
        return milliseconds;
    }

    public void setMilliseconds(int milliseconds) {
        this.milliseconds = milliseconds;
    }

    // Метод nextMillisecond
    public void nextMillisecond() {
        milliseconds += 100;
        if (milliseconds >= 1000) {
            milliseconds = 0;
            nextSecond();
        }
    }

    private void nextSecond() {
        seconds++;
        if (seconds >= 60) {
            seconds = 0;
            nextMinute();
        }
    }

    private void nextMinute() {
        minutes++;
        if (minutes >= 60) {
            minutes = 0;
            nextHour();
        }
    }

    private void nextHour() {
        hours++;
        if (hours >= 24) {
            hours = 0;
        }
    }
}

