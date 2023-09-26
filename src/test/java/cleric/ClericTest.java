package cleric;

import org.example.characters.players.cleric.Cleric;
import org.example.characters.players.cleric.healingitems.Herbs;
import org.example.characters.players.cleric.healingitems.Potion;
import org.example.characters.players.fighters.Dwarf;
import org.example.characters.players.fighters.weapons.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {
    Herbs herbs;
    Potion potion;
    Cleric cleric;
    Sword sword;
    Dwarf dwarf;
    @Before
    public void before(){
        herbs = new Herbs();
        potion = new Potion();
        cleric = new Cleric(100, "Yes", potion);
        sword = new Sword();
        dwarf = new Dwarf(200, "Grambles", sword);
    }
    @Test
    public void canSwitchHealingItem(){
        cleric.switchHealingItem(herbs);
        assertEquals(herbs, cleric.getHealingItem());
    }
    @Test
    public void canHealAlly(){
        cleric.heal(dwarf);
        assertEquals(250, dwarf.getHealthPoints());
    }

}
