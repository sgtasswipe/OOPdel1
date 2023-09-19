package EventManager;

public class EventManager {
    public static void main(String[] args) {
        new EventManager().run();
    }

    private void run() {

        String[] eventNames = {"Poolparty", "CopenHell", "CODELAB PARTY"};
        String[] eventDates = {"23/09/2023", "21/09/2023", "18/09/2023"};
        String[] eventLocations = {"In a pool", "At hells gate", "Codelab"};

        Event event = new Event(eventNames, eventDates, eventLocations, 50);
        System.out.println(event);

        String[] event2Names = {"Party on O-Block" , "Tæsk en Brøndby fan", "Kæmpe udsalg i Bilka"};
        String [] event2Dates = {"11/09/2023", "14/02/2024" , "24/12/2023"};
        String [] event2Locations = {"O-Block", "I Parken", "I Bilka ved Fields"};


        Event event2 = new Event(event2Names,event2Dates, event2Locations,250);
        System.out.println(event2);

        // participants :

        Participant participant1 = new Participant("John", 37);
       Participant participant2 = new Participant("James" , 40);
       Participant participant3= new Participant("Jack", 50);
       Participant participant4 = new Participant("Jon", 26);
       Participant participant5 = new Participant("Jill", 30);
       Participant participant6 = new Participant("Jackleen", 20);

        System.out.println(participant3);


    }
}
