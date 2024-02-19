package oop_seminar.Unit;

public class Magician extends UnitBase{
    int intellect;
    int mana;

    public Magician(String name, int health, int stamina, int weapon, int intellect, int mana) {
        super(name, health, stamina, weapon);
        this.intellect = intellect;
        this.mana = mana;
    }

    @Override
    public String toString() {
        return "Magician{" +
                "name='" + name + '\'' +
                '}';
    }
}
