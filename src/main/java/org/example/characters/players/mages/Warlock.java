package org.example.characters.players.mages;

import org.example.characters.players.mages.familiar.IDefend;
import org.example.characters.players.mages.spells.ISpell;

public class Warlock extends Mage{
    public Warlock(int healthPoints, String name, ISpell spell, IDefend familiar) {
        super(healthPoints, name, spell, familiar);
    }
}
