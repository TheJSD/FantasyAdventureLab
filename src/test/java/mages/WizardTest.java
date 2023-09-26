package mages;

import org.example.characters.enemies.Goblin;
import org.example.characters.players.mages.Wizard;
import org.example.characters.players.mages.familiar.Dragon;
import org.example.characters.players.mages.familiar.Wolf;
import org.example.characters.players.mages.spells.Fireball;
import org.example.characters.players.mages.spells.LightningBolt;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class WizardTest {
    Wizard wizard;
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
        wizard = new Wizard(100, "Morbles",lightningBolt, wolf);
    }
    @Test
    public void canSwitchSpells(){
        wizard.switchSpell(fireball);
        assertEquals(fireball, wizard.getSpell());
    }
    @Test
    public void canSwitchFamiliar(){
        wizard.switchFamiliar(dragon);
        assertEquals(dragon, wizard.getFamiliar());
    }
    @Test
    public void canPonderOrb(){
        assertEquals("Pondering my Orb", wizard.ponderOrb());
    }
    @Test
    public void canCast(){
        wizard.cast(goblin);
        assertEquals(40, goblin.getHealthPoints());
    }
    @Test
    public void familiarCanDefend() {
        wizard.familiarDefends(goblin);
        assertEquals(70, goblin.getHealthPoints());
    }
}
