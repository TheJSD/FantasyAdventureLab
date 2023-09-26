package enemies;

import org.example.characters.enemies.Goblin;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class GoblinTest {
    Goblin goblin;
    @Before
    public void before(){
        goblin = new Goblin(25);
    }
    @Test
    public void canTakeDamage(){
        goblin.takeDamage(10);
        assertEquals(15, goblin.getHealthPoints());
    }
    @Test
    public void canGainHealth(){
        goblin.gainHealth(5);
        assertEquals(30, goblin.getHealthPoints());
    }
}
