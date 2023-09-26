package mages.spells;

import org.example.characters.enemies.Skeleton;
import org.example.characters.players.mages.spells.Fireball;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FireballTest {
    Fireball fireball;
    Skeleton skeleton;
    @Before
    public void before() {
        fireball = new Fireball();
        skeleton = new Skeleton(200);
    }
    @Test
    public void fireballCanDealDamage(){
        fireball.cast(skeleton);
        assertTrue(skeleton.getHealthPoints() >= 50);
        assertTrue(skeleton.getHealthPoints() <= 140);
    }
}
