/**
 * Created by Willem Swarts on 9/9/2016.
 */
import java.util.Random;
public class MSCell
{
    private boolean revealed;
    private boolean bomb;
    private int value;
    private boolean flagged;
    // constructor to initialise
    //variables

    public MSCell() {
        this.revealed = setRevealed();
        this.bomb = isBomb();
        this.value = setValue();
        this.flagged = setFlagged();
    }

    // accessor and mutators
//    public void setRevealed (int userCell) //userCell is the cell which the user picked
//    {
//
//    }
//    public boolean isRevealed()
//    public void setFlagged ()
//    public boolean isFlagged()
    public void setBomb(int field[][])
    {

    }
//    public boolean isBomb()
//    public void setValue(int v)
//    public int getValue()
//    public String toString() // mark BOMB!
//
// this method is crucial!
//Here we overwrite the
//java method – check if it is a
//bomb – if so print a
}