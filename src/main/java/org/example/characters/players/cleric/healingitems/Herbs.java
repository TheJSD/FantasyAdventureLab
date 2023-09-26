package org.example.characters.players.cleric.healingitems;

import org.example.characters.players.Player;

public class Herbs implements IHeal {
    public void heal(Player player){
        player.gainHealth(20);
    }
}
