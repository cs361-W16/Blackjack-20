package models;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by michaelhilton on 1/25/16.
 */
public class testGame {

    Game g = new Game();
    Player p = new Player();

    @Test
    public void testGameCreation(){
        //Game g = new Game();
        assertNotNull(g);
    }
    @Test
    public void testDeckCount(){
       // Game g = new Game();
//        assertEquals(52,g.deck.size());
        g.remove(2);
//        assertEquals(51,g.deck.size());
    }


    @Test
    public void testGameBuildDeck(){
        //Game g = new Game();
        g.buildDeck();
     //   assertEquals(52,g.deck.size());
    }

    @Test
    public void testGameInit(){
       // Game g = new Game();
        g.buildDeck();
        g.shuffle();
        assertNotEquals(2,g.deck.get(0).getValue());
    }

    @Test
    public void testGameStart(){
        //Game g = new Game();
        g.buildDeck();
        g.shuffle();
        //g.dealFour();
//        assertEquals(1,g.cols.get(0).size());
//        assertEquals(1,g.cols.get(1).size());
//        assertEquals(1,g.cols.get(2).size());
//        assertEquals(1,g.cols.get(3).size());
    }

    @Test
    public void testCustomDeal(){
        //Game g = new Game();
        g.buildDeck();
//        g.customDeal(0,3,6,9);
//        assertEquals("2Clubs",g.cols.get(0).get(0).toString());
//        assertEquals("3Clubs",g.cols.get(1).get(0).toString());
//        assertEquals("4Clubs",g.cols.get(2).get(0).toString());
//        assertEquals("5Clubs",g.cols.get(3).get(0).toString());
    }


    @Test
    public void testSplit(){
        Game g = new Game();
        g.buildDeck();
        g.customDeal(1,2,0,14);
        g.p.split(g);
        assert(g.cols.get(1).get(3) == g.cols.get(2).get(0));
    }

    @Test
    public void testRemoveFunction(){
        Game g = new Game();
        g.buildDeck();
        g.customDeal(0,3,6,9);
        g.remove(2);
        assertEquals(0,g.cols.get(2).size());
    }
    //This needs improvement
    public void testHit()
    {
        int i = 1;
        g.hit(i);

        assert(g.deck.size() ==(g.deck.size()-1));

    }

    @Test
    public void testDoubleDown()
    {
        int i = 1;
        int testBetAmount = 2;
        p.doubleDown(i,g);
        assert(p.money == (p.money - (2*testBetAmount)));
        assert(p.isBet == (p.isBet + testBetAmount));
        assert(g.deck.size() ==(g.deck.size()-1));
        //assert stay();



    }
}
