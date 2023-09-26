package org.example.characters.equipment.fighterweapons;

import org.example.characters.enemies.Enemy;

public class Sword implements IWeapon {

    public void attack(Enemy enemy) {
        enemy.takeDamage(35);
    }
}
