package lab6.exercise1;

import utils.In;

public class People {
    private Person first;
    private Person second;

    public People() {
        first = new Person();
        second = new Person(readName(), readAge());
    }

    private String readName() {
        System.out.print("Name: ");
        return In.nextLine();
    }
    
    private int readAge() {
        System.out.print("Age: ");
        return In.nextInt();
    }

    private void show(Person p) {
        System.out.println(p);
    }

    private void udpate(Person p, String name) {
        p.setName(name);
    }

    public static void main(String[] args) {
        People people = new People();

        people.show(people.first);
        people.show(people.second);

        people.udpate(people.first, people.readName());
        people.udpate(people.second, people.readName());

        people.show(people.first);
        people.show(people.second);
    }
}
