package DisappearingSpy;

public class HQ {
    public static void main(String[] args) {
        new HQ().run();
    }

    private void run() {
        printSpies();

    }
    void printSpies() {
        Spy spy1 = assingSpy1Attributes();
        Spy spy2 = assignSpy2Attributes();
        System.out.println("Spy 1 Attributes:");
        System.out.println("Name: " + spy1.spyName);
        System.out.println("Health: " + spy1.spyHealth);

        System.out.println("\nSpy 2 Attributes:");
        System.out.println("Name: " + spy2.spyName);
        System.out.println("Health: " + spy2.spyHealth);

        spy1 = new Spy(spy2);   //  uses constructor to clone spy2 to spy1
        System.out.println(spy1);
        System.out.println(spy2);
        spy1.spyName="Spy master mc Spy";   // assigns new values for spy1.
        spy1.spyHealth = 75;
        System.out.println(spy1);   // here we get the new values for spy1 instead of getting the cloned values from spy2
        System.out.println(spy2);

    }
    public Spy assingSpy1Attributes () {
        Spy spy1 = new Spy();
        spy1.spyHealth = 50;
        spy1.spyName = "James bond";
    return  spy1;

    }
    public Spy assignSpy2Attributes () {
        Spy spy2 = new Spy();
        spy2.spyName= "Edward Snowden";
        spy2.spyHealth = 99;
        return  spy2;
    }




    }

