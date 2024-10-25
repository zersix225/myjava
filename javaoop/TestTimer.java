package javaoop;
// TestTimer.java
public class TestTimer {
    public static void main (String[] args) {
        Timer time = new Timer();
        time.setTime(9, 30, 55);

        while (true) {
            time.increaseTime();
            System.out.println(time.getTime());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
    }
}

class Timer {
    public int timeStamp = 0;

    private int second = 0;
    private int minute = 0;
    private int hour = 0;

    public void setTime(int h, int m, int s) {
        second = s; minute = m; hour = h;
        timeStamp = (hour * 3600) + (minute * 60) + second;
    }

    public void increaseTime() {
        timeStamp = (timeStamp + 1) % 86400;
        updateMembers ();
    }

    private void updateMembers () {
        second = timeStamp % 60;
        minute = (timeStamp / 60) % 60;
        hour = (timeStamp / 3600) % 24;
    }

    public String getTime() {
        return String.format("%02d:", hour) + 
               String.format("%02d:", minute) + 
               String.format("%02d", second);
    } 
}