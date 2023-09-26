package org.example.characters.players.fighters.weapons;

import org.example.characters.enemies.Enemy;

public class Sword implements IWeapon {

    public void attack(Enemy enemy) {
        enemy.takeDamage(35);
    }
}
