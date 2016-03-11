package models;

/**
 * Created by LenovoOwner on 3/10/2016.
 */
public class Dealer {
    public int handScore;

    public void Dealer() {
        handScore = 0;
    }

    public void setHandScore(int newHandScore) {
        handScore = newHandScore;
    }

    public int getHandScore() {
        return handScore;
    }

    public int decision() {
        if (this.getHandScore() <= 16 ) {
            return 0; //hit
        }
        else {
            return 1; //stay
        }
    }

}
