package fourthLab;

public class ClockExt2 extends ClockExt {

    public ClockExt2(int hours, int minutes, int seconds, int milliseconds) {
        super(hours, minutes, seconds, milliseconds);
    }

    // Додаткові методи, якщо потрібно

    public void setClock(int hours, int minutes, int seconds, int milliseconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
        setMilliseconds(milliseconds);
    }

    public void setClock(ClockExt2 otherClock) {
        setClock(otherClock.getHours(), otherClock.getMinutes(), otherClock.getSeconds(), otherClock.getMilliseconds());
    }

    @Override
    public int getHours() {
        return super.getHours();
    }

    @Override
    public void setHours(int hours) {
        super.setHours(hours);
    }

    @Override
    public int getMinutes() {
        return super.getMinutes();
    }

    @Override
    public void setMinutes(int minutes) {
        super.setMinutes(minutes);
    }

    @Override
    public int getSeconds() {
        return super.getSeconds();
    }

    @Override
    public void setSeconds(int seconds) {
        super.setSeconds(seconds);
    }

    @Override
    public int getMilliseconds() {
        return super.getMilliseconds();
    }

    @Override
    public void setMilliseconds(int milliseconds) {
        super.setMilliseconds(milliseconds);
    }

    // Реалізація методу nextMillisecond
    public void nextMillisecond() {
        super.nextMillisecond();
    }
}

