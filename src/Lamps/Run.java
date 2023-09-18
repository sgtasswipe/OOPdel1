package Lamps;

public class Run {
    public static void main(String[] args) {
        new Run().run();
    }

    private void run() {
        pushSwitch();
        pushSwitch();
    }
    boolean  pushSwitch() {
       Lamp lamp = new Lamp();

       if( lamp.turnedOn) {
           lamp.turnedOn=false;
           System.out.println("Lamp is now turned off");
           return lamp.turnedOn;

       }
       if (!lamp.turnedOn) {
          lamp.turnedOn=true;
           System.out.println("Lamp is now turned on");
           return lamp.turnedOn;
       }
        return true;
    }
}
