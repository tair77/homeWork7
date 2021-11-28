package com.company;

public class Main {

    public static void main(String[] args) {
        Magic sheesh = new Magic();
        Medic bro = new Medic();
        Warrior sos = new Warrior();
        Hero[] heroes = {sheesh, bro, sos};
        for (int i = 0; i < heroes.length; i++) {
            heroes[i].applySuperAbility("ability");


        }
    }
}
