package org.example.characters.players.mages.spells;

import org.example.characters.enemies.Enemy;

public class Fireball implements ISpell {
    public void cast(Enemy enemy){
        int damageDealt = (int) (Math.random() * (90)) + 60;
        enemy.takeDamage(damageDealt);
    }
}
