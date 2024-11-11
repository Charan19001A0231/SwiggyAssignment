import org.junit.Assert;
import org.junit.Test;

public class ArenaTest {
    @Test
    public void testFight() {
        Player playerA = new Player(50, 5, 10);
        Player playerB = new Player(100, 10, 5);
        MagicalArena arena = new MagicalArena(playerA, playerB);
        arena.fight();
        Assert.assertFalse(playerA.isAlive() && playerB.isAlive());
    }
}