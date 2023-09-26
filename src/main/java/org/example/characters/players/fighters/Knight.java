package org.example.characters.players.fighters;

import org.example.characters.players.fighters.weapons.IWeapon;

public class Knight extends Fighter{
    private int armour;

    public Knight(int healthPoints, String name, IWeapon weapon) {
        super(healthPoints, name, weapon);
        this.armour = 100;
    }

    public int getArmour() {
        return armour;
    }

    public void takeDamage(int amount){
        if (armour > 0) {
            if (amount > armour) {
                int excess = amount - armour;
                armour = 0;
                this.takeDamage(excess);
            } else {
                this.armour -= amount;
            }
        } else {
            super.takeDamage(amount);
        }
    }
}
