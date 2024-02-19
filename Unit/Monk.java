package oop_seminar.Unit;

public class Monk extends UnitBase{
    String faith; // вера
    int enlightenment; // просветление
    int healing;//целительство

    public Monk(String name, int health, int stamina, int weapon, String faith, int enlightenment, int healing) {
        super(name, health, stamina, weapon);
        this.faith = faith;
        this.enlightenment = enlightenment;
        this.healing = healing;
    }

    @Override
    public String toString() {
        return "Monk{" +
                "name='" + name + '\'' +
                '}';
    }
}
