package models;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by LenovoOwner on 3/10/2016.
 */
public class testDealer {

    Dealer mrDealer = new Dealer();
    @Test
    public void testDealerCreation() {
        assertNotNull(mrDealer);
    }

    @Test
    public void testSetHandScore() {
        mrDealer.setHandScore(10);
        assertEquals(mrDealer.getHandScore(),10);
    }

    @Test
    public void testDecision() throws Exception {
        int dealerDecision;
        dealerDecision = mrDealer.decision();
        assertEquals(dealerDecision, 0);
    }
}