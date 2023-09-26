package org.example.characters.players.fighters;

import org.example.characters.enemies.Enemy;
import org.example.characters.players.fighters.weapons.IWeapon;
import org.example.characters.players.Player;

public abstract class Fighter extends Player {
    private IWeapon weapon;

    public Fighter(int healthPoints, String name, IWeapon weapon) {
        super(healthPoints, name);
        this.weapon = weapon;
    }
    public IWeapon getWeapon() {
        return weapon;
    }
    public void switchWeapon(IWeapon newWeapon){
        this.weapon = newWeapon;
    }
    public void attack(Enemy enemy){
        this.weapon.attack(enemy);
    }

}
