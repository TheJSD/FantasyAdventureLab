package fighters;

import org.example.characters.enemies.Goblin;
import org.example.characters.players.fighters.weapons.Axe;
import org.example.characters.players.fighters.weapons.Sword;
import org.example.characters.players.fighters.Dwarf;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DwarfTest {
    Dwarf dwarf;
    Sword sword;
    Axe axe;
    Goblin goblin;
    @Before
    public void before(){
        sword = new Sword();
        axe = new Axe();
        dwarf = new Dwarf(200, "Grambles", sword);
        goblin = new Goblin(70);
    }
    @Test
    public void canGetName(){
        assertEquals("Grambles", dwarf.getName());
    }
    @Test
    public void canSwitchWeapon(){
        dwarf.switchWeapon(axe);
        assertEquals(axe, dwarf.getWeapon());
    }
    @Test
    public void canAttackEnemy(){
        dwarf.attack(goblin);
        assertEquals(35, goblin.getHealthPoints());
    }
    @Test
    public void canDrinkAle(){
        dwarf.drinkAle();
        assertEquals(25, dwarf.getDrunkeness());
        assertEquals(230, dwarf.getHealthPoints());
    }
    @Test
    public void canTakeDamage(){
        dwarf.takeDamage(50);
        assertEquals(150, dwarf.getHealthPoints());
    }
    @Test
    public void canBeHealed(){
        dwarf.gainHealth(20);
        assertEquals(220, dwarf.getHealthPoints());
    }
}
