package oop_seminar.Unit;

import java.util.Random;

/*
UnitBase
поля данных
-name
-health - здоровье
-stamina - выносливость
-weapon - оружие

поля поведения

-damage - повреждение
-attack - атака
-death - смерть

 */
abstract class UnitBase {
    protected String name;
    protected int health;
    protected  int stamina ;
    protected  int weapon;
    protected static Random r = new Random();

    public UnitBase(String name, int health, int stamina, int weapon) {
        this.name = name;
        this.health = health;
        this.stamina = stamina;
        this.weapon = weapon;
    }
    protected void  GetDamage(int damage){
        if(this.health >0){
            this.health -=damage;
        }
    }

    protected void attack(UnitBase target){
        int damage= UnitBase.r.nextInt(health);
        target.GetDamage(damage);
    }
    protected void death(UnitBase target){
        if(target.GetHealth() <  0){
            System.out.println("You're dead");
        }
    }
    public int GetHealth(){
        return health;
    }



}
