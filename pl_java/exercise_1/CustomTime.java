package pl_java.exercise_1;

import java.time.LocalTime;

public class CustomTime{

/*
 * Constants
 */
    final static int MAX_HOURS = 23;
	final static int MAX_MINS = 59;
	final static int MAX_SECS = 59;


/*
 * Attributes
 */
    private int hour;   // current hour in military time
    private int minute; // current minute in military time
    private int second; // current second in military time


/*
 * Constructors
 */
    // set the time to the time specified by the parameters
    public CustomTime(int hour, int minute, int second){
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }
    
    // Default constructor which returns current time on initialization
    public CustomTime(){
        LocalTime time = LocalTime.now();
        hour = time.getHour();
        minute = time.getMinute();
        second = time.getSecond();
    }


/*
 * Getters
 */
    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }


/*
 * Setters
 */
    public void setHour(int hour) {
        if (hour >= 0 && hour <= MAX_HOURS) {
            this.hour = hour;
        }
        else {
            System.out.println("Error: hour must be between 0 and 23 inclusive!");
            hour = 0;
        }
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute <= MAX_MINS) {
            this.minute = minute;
        }
        else {
            System.out.println("Error: minute must be between 0 and 59 inclusive!");
            minute = 0;
        }
    }

    public void setSecond(int second) {
        if (second >= 0 && second <= MAX_SECS) {
            this.second = second;
        }
        else {
            System.out.println("Error: second must be between 0 and 59 inclusive!");
            second = 0;
        }
    }


/*
 * Methods
 */
    // return the time to the calling method in a three-membered array
    int[] getTime(){
        return new int[] {hour, minute, second};
    }

    // increment the current time by one second
    void incrementTime(){
        second = ++second % (MAX_SECS + 1);
        if(second == 0) {
            minute = ++minute % (MAX_MINS + 1);
        }
        if(second == 0 && minute == 0) {
            hour = ++hour % (MAX_HOURS + 1);
        }
    }
}