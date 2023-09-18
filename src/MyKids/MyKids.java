package MyKids;

public class MyKids {
    public static void main(String[] args) {
        new MyKids().run() ;
    }

    private void run() {
        Kid kid1 = new Kid();
        kid1.birthYear=2000;
        kid1.name= "Jack";
        Kid kid2 = new Kid();
        kid2.birthYear = 2013;
        kid2.name = "John";
        Kid kid3 = new Kid();
        kid3.name ="James";
        kid3.birthYear = 2023;


        printKids(kid1,kid2, kid3);

        System.out.println();
        System.out.println("Using ToString:");
        System.out.println(kid1);
        System.out.println(kid2);
        System.out.println(kid3);
        System.out.println( );
        System.out.println("Name change at kid 1 ");
        kid1.name= "Johnny";
        System.out.println(kid1);
    }
    private  void printKids(Kid kid1, Kid kid2, Kid kid3) {
        System.out.println("Kid1 name is : "+ kid1.name);
        System.out.println("Kid1 birthyear is: " +kid1.birthYear);
        System.out.println("kid2 name is: " + kid2.name);
        System.out.println("Kid2 birtyear is: " + kid2.birthYear);
        System.out.println("Kid3 name is: " + kid3.name   );
        System.out.println("Kid3 birthyear is: " + kid3.birthYear);
    }
}
