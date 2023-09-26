package org.example.characters.players.mages.spells;

import org.example.characters.enemies.Enemy;

public class LightningBolt implements ISpell{
    public void cast(Enemy enemy){
        enemy.takeDamage(60);
    }
}
