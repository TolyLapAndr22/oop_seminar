package oop_seminar.Unit;
/*
поля данных
- сила - strength
- ловкость - agility
 поля поведения
 - work
 */
public class Peasant extends UnitBase{
 int strength;
 int agility;

 public Peasant(String name, int health, int stamina, int weapon, int strength, int agility) {
  super(name, health, stamina, weapon);
  this.strength = strength;
  this.agility = agility;
 }

 @Override
 protected void attack(UnitBase target) {
  int damage = UnitBase.r.nextInt(1,5)*strength*agility;
  target.GetDamage(damage);
 }
 public void work(int hour){
  stamina-= hour /4;
 }

 @Override
 public String toString() {
  return "Peasant{" +
          "name='" + name + '\'' +
          '}';
 }
}
