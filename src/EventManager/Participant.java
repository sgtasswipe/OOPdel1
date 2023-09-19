package EventManager;

public class Participant {
    public String names;
    public  int age;

    @Override
    public String toString() {
        return "Participant{" +
                "names='" + names + '\'' +
                ", age=" + age +
                '}';
    }

    public  Participant(String name, int age) {
        this.age = age;
        this.names = name;
    }
}
