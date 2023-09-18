package DisappearingSpy;

public class Spy {
    String spyName;
    int spyHealth;


    @Override
    public String toString() {
        return "Spy{" +
                "spyName='" + spyName + '\'' +
                ", spyHealth=" + spyHealth +
                '}';
    }
    public Spy() {
    }

    public Spy(Spy other) {  // creates a contructor. still need to figure out what that is :D
        this.spyName = other.spyName;
        this.spyHealth = other.spyHealth;
    }


}
