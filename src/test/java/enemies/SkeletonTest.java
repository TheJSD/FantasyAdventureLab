package enemies;

import org.example.characters.enemies.Skeleton;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SkeletonTest {
    Skeleton skeleton;
    @Before
    public void before(){
        skeleton = new Skeleton(25);
    }
    @Test
    public void canTakeDamage(){
        skeleton.takeDamage(10);
        assertEquals(15, skeleton.getHealthPoints());
    }
    @Test
    public void canGainHealth(){
        skeleton.gainHealth(5);
        assertEquals(30, skeleton.getHealthPoints());
    }
}
