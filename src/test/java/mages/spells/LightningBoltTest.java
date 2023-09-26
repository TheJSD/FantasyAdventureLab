package mages.spells;

import org.example.characters.enemies.Skeleton;
import org.example.characters.players.mages.spells.LightningBolt;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LightningBoltTest {
    LightningBolt lightningBolt;
    Skeleton skeleton;
    @Before
    public void before() {
        lightningBolt = new LightningBolt();
        skeleton = new Skeleton(100);
    }
    @Test
    public void lightningBoltCanDealDamage(){
        lightningBolt.cast(skeleton);
        assertEquals(40, skeleton.getHealthPoints());
    }
}
