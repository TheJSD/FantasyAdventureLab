package org.example.characters.players.mages;

import org.example.characters.players.mages.familiar.IDefend;
import org.example.characters.players.mages.spells.ISpell;

public class Wizard extends Mage{
    public Wizard(int healthPoints, String name, ISpell spell, IDefend familiar) {
        super(healthPoints, name, spell, familiar);
    }
    public String ponderOrb(){
        return "Pondering my Orb";
    }
}
