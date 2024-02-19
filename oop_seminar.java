package oop_seminar;

import oop_seminar.Unit.*;

/*
Урок 1. Принципы ООП: Инкапсуляция, наследование, полиморфизм

Проанализировать персонажей "
UnitBase
-health - здоровье
-stamina - выносливость
-weapon - оружие

++1 Крестьянин Peasant
2 Разбойник Outlaw
++3 Снайпер Sniper
++4 Колдун Magician
++5 Копейщик Spearman
++6 Арбалетчик Crossbowman
++7 Монах Monk
".
Для каждого определит 8 полей данных(здоровье, сила итд) 3-4 поля поведения(методов атаковать, вылечить итд).
Создать абстрактный класс и иерархию наследников.
Расположить классы в пакет так, чтобы в основной программе небыло видно их полей.
В не абстрактных классах переопределить метод toString() так чтобы он возвращал название класса или имя.
Создать в основной программе по одному обьекту каждого не абстрактного класса и вывести в консоль его имя.


 */
public class oop_seminar {
    public static void main(String[] args) {
        Crossbowman crossbowman = new Crossbowman("1 crossbowman",10,6,7,5,4);
        Magician magician = new Magician("2 magician",10,6,4,6,6);
        Monk monk = new Monk("3 monk",10,4,5,"christianity",10,11);
        Outlaw outlaw =new Outlaw("4 outlaw", 10,5,8,5,1);
        Peasant peasant = new Peasant("5 peasant",10,5,6,7,2);
        Sniper sniper =new Sniper("6 sniper",10,5,6,7,2);
        Spearman spearman =new Spearman("7 spearman",10,3, 5,6,7);

        System.out.println(crossbowman.toString());
        System.out.println(magician.toString());
        System.out.println(monk.toString());
        System.out.println(outlaw.toString());
        System.out.println(peasant.toString());
        System.out.println(sniper.toString());
        System.out.println(spearman.toString());

    }
}
