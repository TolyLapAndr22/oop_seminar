package oop_seminar.Unit;

public class Crossbowman extends UnitBase{
    int accuracy; // точность
    int amounOfarrows; //кол стрел

    public Crossbowman(String name, int health, int stamina, int weapon, int accuracy, int amounOfarrows) {
        super(name, health, stamina, weapon);
        this.accuracy = accuracy;
        this.amounOfarrows = amounOfarrows;
    }

    @Override
    public String toString() {
        return "Crossbowman{" +
                "name='" + name + '\'' +
                '}';
    }
}
