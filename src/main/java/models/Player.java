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

    public void split(Game g){
        if(g.cols.get(1).get(0).getValue() == g.cols.get(1).get(1).getValue()) {//if card 1 value == card 2
            g.move(1, 2); //moves one of the cards over to the new stack
            //TODO BETTING FUNCTION GOES HERE
        }
        this.isSplit = true;
    }

    public void doubleDown(int i, Game g){
        bet();
        g.hit(i); //TODO ACTUALLY IMPLEMENT THIS I THINK IT"S WRONG ALSO CHECK TO MAKE SURE YOU CAN DO IT
        //stay();
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
        //TODO NEEDS LEYGIT GAME SCORING AND ENDING
        }
}