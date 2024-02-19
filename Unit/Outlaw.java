package oop_seminar.Unit;

public class Outlaw extends UnitBase{
    int trick; // хитрость
    int dexterity; //ловкость

    public Outlaw(String name, int health, int stamina, int weapon, int trick, int dexterity) {
        super(name, health, stamina, weapon);
        this.trick = trick;
        this.dexterity = dexterity;
    }

    @Override
    public String toString() {
        return "Outlaw{" +
                "name='" + name + '\'' +
                '}';
    }
}
