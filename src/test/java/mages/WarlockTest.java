package mages;

import org.example.characters.enemies.Goblin;
import org.example.characters.players.mages.Warlock;
import org.example.characters.players.mages.familiar.Dragon;
import org.example.characters.players.mages.familiar.Wolf;
import org.example.characters.players.mages.spells.Fireball;
import org.example.characters.players.mages.spells.LightningBolt;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class WarlockTest {
    Warlock warlock;
    Wolf wolf;
    Dragon dragon;
    Fireball fireball;
    Goblin goblin;
    LightningBolt lightningBolt;
    @Before
    public void before() {
        wolf = new Wolf();
        dragon = new Dragon();
        fireball = new Fireball();
        lightningBolt = new LightningBolt();
        goblin = new Goblin(100);
        warlock = new Warlock(100, "Morbles",lightningBolt, wolf);
    }
    @Test
    public void canSwitchSpells(){
        warlock.switchSpell(fireball);
        assertEquals(fireball, warlock.getSpell());
    }
    @Test
    public void canSwitchFamiliar(){
        warlock.switchFamiliar(dragon);
        assertEquals(dragon, warlock.getFamiliar());
    }
    @Test
    public void canCast(){
        warlock.cast(goblin);
        assertEquals(40, goblin.getHealthPoints());
    }
    @Test
    public void familiarCanDefend() {
        warlock.familiarDefends(goblin);
        assertEquals(70, goblin.getHealthPoints());
    }
}
