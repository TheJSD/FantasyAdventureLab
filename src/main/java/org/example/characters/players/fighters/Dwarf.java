package org.example.characters.players.fighters;

import org.example.characters.players.fighters.weapons.IWeapon;

public class Dwarf extends Fighter{
    private int drunkeness;
    public Dwarf(int healthPoints, String name, IWeapon weapon) {
        super(healthPoints, name, weapon);
        this.drunkeness = 0;
    }
    public void drinkAle(){
        this.gainHealth(30);
        this.drunkeness += 25;
    }

    public int getDrunkeness() {
        return drunkeness;
    }
}

