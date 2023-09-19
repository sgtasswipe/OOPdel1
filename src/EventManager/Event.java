package EventManager;

import java.util.Arrays;

public class Event {
    public String[] name;
    public String[] date;
    public String[] location;
    public int numberOfParticipants;

    @Override
    public String toString() {
        return "WELCOME TO EVENTS: " + Arrays.toString(name) + " THE [" + Arrays.toString(date) + "]" + " ITS HAPPENING AT: " + Arrays.toString(location) + "Amount of atendees: " + numberOfParticipants;
    }

    public Event(String[] name, String[] date, String[] location, int numberOfParticipants) {
        this.name = name;
        this.date = date;
        this.location = location;
        this.numberOfParticipants = numberOfParticipants;

    }
}

