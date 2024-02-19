package oop_seminar.Unit;

public class Spearman extends UnitBase{
    int strength; // сила
    int protection; //защита

    public Spearman(String name, int health, int stamina, int weapon, int strength, int protection) {
        super(name, health, stamina, weapon);
        this.strength = strength;
        this.protection = protection;
    }

    @Override
    public String toString() {
        return "Spearman{" +
                "name='" + name + '\'' +
                '}';
    }
}
