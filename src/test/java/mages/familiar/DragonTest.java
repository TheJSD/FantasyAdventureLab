package mages.familiar;

import org.example.characters.enemies.Goblin;
import org.example.characters.players.mages.familiar.Dragon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class DragonTest {
    Dragon dragon;
    Goblin goblin;

    @Before
    public void before() {
        dragon = new Dragon();
        goblin = new Goblin(100);
    }
    @Test
    public void canDefend(){
        dragon.defend(goblin);
        assertTrue(goblin.getHealthPoints() <=100);
        assertTrue(goblin.getHealthPoints() >=-225);
    }
}
