package cleric;

import org.example.characters.players.Player;
import org.example.characters.players.cleric.healingitems.Potion;
import org.example.characters.players.fighters.Knight;
import org.example.characters.players.fighters.weapons.Axe;
import org.example.characters.players.fighters.weapons.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PotionTest {
    Potion potion;
    Knight knight;
    Sword sword;
    @Before
    public void before(){
        sword = new Sword();
        knight = new Knight(200, "Arthur", sword);
        potion = new Potion();
    }
    @Test
    public void canHeal(){
        potion.heal(knight);
        assertEquals(250, knight.getHealthPoints());
    }

}
