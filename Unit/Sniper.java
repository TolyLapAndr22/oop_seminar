package oop_seminar.Unit;

public class Sniper extends UnitBase{
    int accuracy; //точность
    int disguise; // маскировка

    public Sniper(String name, int health, int stamina, int weapon, int accuracy, int disguise) {
        super(name, health, stamina, weapon);
        this.accuracy = accuracy;
        this.disguise = disguise;
    }

    @Override
    public String toString() {
        return "Sniper{" +
                "name='" + name + '\'' +
                '}';
    }
}


