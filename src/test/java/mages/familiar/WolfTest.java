package mages.familiar;

import org.example.characters.enemies.Goblin;
import org.example.characters.players.mages.familiar.Wolf;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WolfTest {
    Wolf wolf;
    Goblin goblin;
    @Before
    public void before() {
        wolf = new Wolf();
        goblin = new Goblin(100);
    }
    @Test
    public void canDefend() {
        wolf.defend(goblin);
        assertEquals(70, goblin.getHealthPoints());
    }
}
