package org.example.characters.players.mages.familiar;

import org.example.characters.enemies.Enemy;

public class Dragon implements IDefend {
    public void defend(Enemy enemy){
        int willAttack = (int) (Math.random() * 4);
        if (willAttack >=2) {
            int damageDealt = (int) (Math.random() * (301) + 25);
            enemy.takeDamage(damageDealt);
        }
    }
}
