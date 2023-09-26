package fighters.weapons;

import org.example.characters.enemies.Skeleton;
import org.example.characters.equipment.fighterweapons.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SwordTest {
    Sword sword;
    Skeleton skeleton;
    @Before
    public void before(){
        sword = new Sword();
        skeleton = new Skeleton(100);
    }
    @Test
    public void canDealDamage(){
        sword.attack(skeleton);
        assertEquals(65, skeleton.getHealthPoints());
    }
}
