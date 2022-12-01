import model.Group;
import model.Students;
import model.Teams;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //Lobutche
        ArrayList<Students> Lobutche_Students = new ArrayList<Students>();
        Students l1 = new Students("Pranjal", 23030, 18);
        Lobutche_Students.add(l1);
        Students l2 = new Students("Tatsam", 23045, 17);
        Lobutche_Students.add(l2);
        Students l3 = new Students("Sushant", 23056, 18);

        //Khumbila
        ArrayList<Students> Khumbila_Students = new ArrayList<Students>();
        Students k1 = new Students("Sanjay", 230667, 56);
        Khumbila_Students.add(k1);
        Students k2 = new Students("Arpan", 12345, 43);
        Khumbila_Students.add(k2);
        Students k3 = new Students("Aarnov", 123456, 97);

        //Team List
        ArrayList<Teams> TeamLobutche = new ArrayList<Teams>();
        Teams  t1 = new Teams(Lobutche_Students, "A");
        TeamLobutche.add(t1);

        ArrayList<Teams> TeamKhumbila = new ArrayList<Teams>();
        Teams t2 = new Teams(Khumbila_Students, "B");
        TeamKhumbila.add(t2);

        //Group List
        Group g1 = new Group("Highschool", TeamLobutche);
        Group g2 = new Group("Highschool", TeamKhumbila);
    }
}