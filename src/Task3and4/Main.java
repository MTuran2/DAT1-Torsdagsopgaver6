package Task3and4;

import Task2.Cafe;

import java.util.ArrayList;

public class Main {
    static ArrayList<Room> rooms = new ArrayList<Room>();

    public static void main(String[] args) {
        Room r1 = new Room(3, 3, 5);
        Room r2 = new Room(2, 2, 3);
        Room r3 = new Room(5, 8, 8);

        rooms.add(r1);
        rooms.add(r2);
        rooms.add(r3);

        Building b1 = new Building(rooms, 3, 5, false);

        // lamps in building:
        System.out.println(b1.countLampsInBuilding());
        // Is the building normal?
        System.out.println(b1.isNormal());

    }
}
