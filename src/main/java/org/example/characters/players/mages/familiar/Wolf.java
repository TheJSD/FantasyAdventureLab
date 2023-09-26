package org.example.characters.players.mages.familiar;

import org.example.characters.enemies.Enemy;

public class Wolf implements IDefend{
    public void defend(Enemy enemy){
        enemy.takeDamage(30);
    }
}
