package models;


public class Player
{
    public int score;
    public int money;
    public int betAmount;
    public int isBet;
    public boolean isSplit;

    public Player()
    {
        score = 0;
        money = 10;
        isBet = 0; //amount player bets
        betAmount = 2;
        isSplit = false;
    }

    public void bet()
    {
        if (money >= betAmount) {
            money = money - betAmount;
            isBet = isBet + betAmount;
        }
        else
        {
            System.out.println("Not enough money");
        }
    }

    public void stay(Game g) {
        int dealScore = g.getColScore(0);
        while(dealScore <= 16) { //dealer keeps hitting
            g.hit(0);
            dealScore = g.getColScore(0);
        }
        return;
        }
}