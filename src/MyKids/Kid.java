package MyKids;

import java.time.LocalDateTime;

public class Kid {
    int birthYear;   // tilstand
    String name;  // tilstand

    @Override
    public String toString() {
        return   name + ", " + (2023-birthYear) + " years old" ;

    }
}

