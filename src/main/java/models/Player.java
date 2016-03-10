package models;


public class Player
{
    public int score;
    public int money;
    public int initBetAmount;
    public int isBet;

    public Player()
    {
        score = 0;
        money = 100;
        isBet = 0; //amount player bets
        initBetAmount = 5;
    }

    public void bet(int betAmount) //pass betting amount to bet function
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

    public void initBet() //call initBet function when game starts
    {
        bet(initBetAmount);
    }


}
