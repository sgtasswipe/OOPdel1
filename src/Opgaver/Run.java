package Opgaver;

public class Run {
    public static void main(String[] args) {
        new Run().run();

    }

    private void run() {
        HelloMyObject myObj = new HelloMyObject();
        myObj.color = "RED";
        myObj.size = 40;


        HelloMyObject myObj2 = new HelloMyObject();
        myObj2.size = 5;
        myObj2.color = "BLUE";
        printObjects( myObj, myObj2);

    }
    private void printObjects(HelloMyObject myObj, HelloMyObject myObj2){
            System.out.println();
            System.out.println("Object 1 size: " + myObj.size);
            System.out.println("Object 1 color: " + myObj.color);
            System.out.println("Object 2 size: " + myObj2.size);
            System.out.println("Object 2 color: " + myObj2.color);
        }

}
