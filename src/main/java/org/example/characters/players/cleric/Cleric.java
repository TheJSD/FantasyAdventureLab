package org.example.characters.players.cleric;

import org.example.characters.players.Player;
import org.example.characters.players.cleric.healingitems.IHeal;

public class Cleric extends Player {
    private IHeal healingItem;

    public Cleric(int healthPoints, String name, IHeal healingItem) {
        super(healthPoints, name);
        this.healingItem = healingItem;
    }

    public IHeal getHealingItem() {
        return healingItem;
    }
    public void switchHealingItem(IHeal newHealingItem){
        this.healingItem = newHealingItem;
    }
    public void heal(Player player){
        this.healingItem.heal(player);
    }
}
