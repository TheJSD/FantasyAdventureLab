package fighters.weapons;

import org.example.characters.enemies.Skeleton;
import org.example.characters.players.fighters.weapons.Axe;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AxeTest {
    Axe axe;
    Skeleton skeleton;
    @Before
    public void before(){
        axe = new Axe();
        skeleton = new Skeleton(100);
    }
    @Test
    public void canDealDamage(){
        axe.attack(skeleton);
        assertTrue(55 <= skeleton.getHealthPoints() && skeleton.getHealthPoints()<=85);
    }
}
