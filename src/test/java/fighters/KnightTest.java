package fighters;

import org.example.characters.enemies.Goblin;
import org.example.characters.equipment.fighterweapons.Axe;
import org.example.characters.equipment.fighterweapons.Sword;
import org.example.characters.players.fighters.Knight;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class KnightTest {
    Knight knight;
    Sword sword;
    Axe axe;
    Goblin goblin;
    @Before
    public void before() {
        sword = new Sword();
        axe = new Axe();
        knight = new Knight(200, "Arthur", sword);
        goblin = new Goblin(70);
    }
    @Test
    public void hasArmour(){
        assertEquals(100, knight.getArmour());
    }
    @Test
    public void damageHitsArmourFirst(){
        knight.takeDamage(99);
        assertEquals(200, knight.getHealthPoints());
        assertEquals(1, knight.getArmour());
    }
    @Test
    public void excessDamageGoesForHP(){
        knight.takeDamage(165);
        assertEquals(0, knight.getArmour());
        assertEquals(135, knight.getHealthPoints());
    }
}
