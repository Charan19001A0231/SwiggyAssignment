public class MagicalArena {
    Player playerA;
    Player playerB;

    public MagicalArena(Player playerA, Player playerB) {
        this.playerA = playerA;
        this.playerB = playerB;
    }

    void fight() {
        Player attacker = playerA.health < playerB.health ? playerA : playerB;
        Player defender = attacker == playerA ? playerB : playerA;

        while (playerA.isAlive() && playerB.isAlive()) {
            int attackRoll = attacker.attack();
            int defenseRoll = defender.defend();

            int damage = attackRoll * attacker.attack - defenseRoll * defender.strength;
            if (damage > 0) {
                defender.reduceHealth(damage);
            }

            // Swap roles for the next round
            Player temp = attacker;
            attacker = defender;
            defender = temp;
        }

        if (playerA.isAlive()) {
            System.out.println("Player A wins!");
        } else {
            System.out.println("Player B wins!");
        }
    }
}
