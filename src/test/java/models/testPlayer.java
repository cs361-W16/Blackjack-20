package models;

import org.junit.Test;

/**
 * Created by lehaz_000 on 09.03.2016.
 */
public class testPlayer {

    Game g = new Game();
    Player p = new Player();
    Card testCard1 = new Card(10, Suit.Clubs);
    Card testCard2 = new Card(9, Suit.Hearts);

    @Test
    public void testBet()
    {
        int testBetAmount;
        p.money = 10;
        p.isBet = 0;
        p.betAmount = 2;

        //If player has enough money
        //testBetAmount = 2;
        p.bet(1);
        assert(p.isBet == 2);

        //If player doesn't have enough money
        p.money = 1;
        p.bet(1);
        assert(p.isBet == 2);
    }

    @Test
    public void testStay() {
        g.newGame();
        g.p.score = 3;
        p.stay(g);
        if (g.dealerScore < 22)
            assert(g.winState == "l");
        else
            assert(g.winState == "w");
        g.p.score = 21;
        p.stay(g);
        if (g.dealerScore == 21)
            assert(g.winState == "t");
        else
            assert(g.winState == "w");

    }

    @Test
    public void testSplit(){
        g.addCardToCol(1,testCard1);
        g.addCardToCol(1,testCard1);
        p.split(g);
        assert(g.cols.get(2).size() == 1);

        g.cols.get(1).clear();
        g.cols.get(2).clear();
        g.addCardToCol(1,testCard1);
        g.addCardToCol(1,testCard2);
        p.split(g);
        assert(g.cols.get(2).size() == 0); //should be empty as that split is illegal
    }

    @Test
    public void testDoubleDown()
    {
        g.newGame();

        int i = 1;
        int testBetAmount = 2;
        int prevSize, prevBet;
        prevSize = g.deck.size();
        prevBet = p.isBet;
        p.doubleDown(i,g);


        assert(p.isBet == (prevBet + testBetAmount));

    }
}
