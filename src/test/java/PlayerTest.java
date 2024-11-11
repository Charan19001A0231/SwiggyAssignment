import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerTest {
    @Test
    public void testAttack() {
        Player player = new Player(50, 5, 10);
        int attackRoll = player.attack();
        assertTrue("Attack roll should be between 1 and 6", attackRoll >= 1 && attackRoll <= 6);
    }

    @Test
    public void testDefend() {
        Player player = new Player(100, 5, 10);
        int defenseRoll = player.defend();
        assertTrue("Defense roll should be between 1 and 6", defenseRoll >= 1 && defenseRoll <= 6);
    }

    @Test
    public void testTakeDamage() {
        Player player = new Player(100, 10, 5);
        player.reduceHealth(20);
        assertEquals(80, player.getHealth());
    }

    @Test
    public void testIsAlive() {
        Player player = new Player(10, 5, 5);
        player.reduceHealth(10);
        assertFalse(player.isAlive());
    }

}
