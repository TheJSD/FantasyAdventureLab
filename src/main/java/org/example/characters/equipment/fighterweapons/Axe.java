package org.example.characters.equipment.fighterweapons;

import org.example.characters.enemies.Enemy;

public class Axe implements IWeapon{
    public void attack(Enemy enemy) {
        int damageDealt = (int) (Math.random() * (31)) + 15;
        enemy.takeDamage(damageDealt);
    }
}
