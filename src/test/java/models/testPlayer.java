package models;

import org.junit.Test;

/**
 * Created by lehaz_000 on 09.03.2016.
 */
public class testPlayer {

    Player p = new Player();
    Game g = new Game();

    @Test
    public void testBet()
    {
        int testBetAmount;
        p.money = 10;
        p.isBet = 0;
        p.betAmount = 2;

        //If player has enough money
        //testBetAmount = 2;
        p.bet();
        assert(p.money == (p.money - p.betAmount));
        assert(p.isBet == (p.isBet + p.betAmount));

        //If player doesn't have enough money
        p.money = 1;
        p.bet();
        assert(System.out.equals("Not enough money"));
    }

    @Test
    public void testStay()
    {
        int dealScore = g.getColScore(0);
        p.stay();
        assert(dealScore >= 17);
    }



}
