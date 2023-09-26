package cleric;

import org.example.characters.players.cleric.healingitems.Herbs;
import org.example.characters.players.fighters.Knight;
import org.example.characters.players.fighters.weapons.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HerbsTest {
    Herbs herbs;
    Knight knight;
    Sword sword;
    @Before
    public void before(){
        sword = new Sword();
        knight = new Knight(200, "Arthur", sword);
        herbs = new Herbs();
    }
    @Test
    public void canHeal(){
        herbs.heal(knight);
        assertEquals(220, knight.getHealthPoints());
    }
}
