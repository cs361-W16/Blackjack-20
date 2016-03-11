package models;

import org.junit.Test;

/**
 * Created by lehaz_000 on 09.03.2016.
 */
public class testPlayer {

    Player p = new Player();

    @Test
    public void testBet()
    {
        int testBetAmount;
        p.money = 100;
        p.isBet = 0;
        p.initBetAmount = 5;

        //If player has enough money
        testBetAmount = 10;
        p.bet(testBetAmount);
        assert(p.money == (p.money - testBetAmount));
        assert(p.isBet == (p.isBet + testBetAmount));

        //If player doesn't have enough money
        p.money = 5;
        p.bet(testBetAmount);
        assert(System.out.equals("Not enough money"));
    }

    @Test
    public void testInitBet()
    {
        p.bet(p.initBetAmount);

        assert(p.money == (p.money - p.initBetAmount));
        assert(p.isBet == (p.isBet + p.initBetAmount));
        //Not sure but bet function gets tested by testBet function anyway
    }

}
