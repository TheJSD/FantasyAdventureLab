package org.example.characters.players.mages;

import org.example.characters.enemies.Enemy;
import org.example.characters.players.Player;
import org.example.characters.players.mages.familiar.IDefend;
import org.example.characters.players.mages.spells.ISpell;

public abstract class Mage extends Player {
    private ISpell spell;
    private IDefend familiar;

    public Mage(int healthPoints, String name, ISpell spell, IDefend familiar) {
        super(healthPoints, name);
        this.spell = spell;
        this.familiar = familiar;
    }

    public ISpell getSpell() {
        return spell;
    }

    public IDefend getFamiliar() {
        return familiar;
    }
    public void switchSpell(ISpell newSpell) {
        this.spell = newSpell;
    }
    public void switchFamiliar(IDefend newFamiliar) {
        this.familiar = newFamiliar;
    }
    public void cast(Enemy enemy){
        this.spell.cast(enemy);
    }
    public void familiarDefends(Enemy enemy){
        this.familiar.defend(enemy);
    }
}
