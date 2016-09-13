/**
 * Created by Willem Swarts on 9/9/2016.
 */

import java.util.Random;
import java.util.Arrays;
public class MSCell
{
    private boolean revealed;
    private boolean bomb;
    private int value;
    private boolean flagged;
    // constructor to initialise
    //variables

    public MSCell()
    {
        this.revealed = false;
        this.bomb = false;
        this.value = 0;
        this.flagged = false;
    }

    // accessor and mutators
//    public void setRevealed (int userCell) //userCell is the cell which the user picked
//    {
//
//    }
//    public boolean isRevealed()
//    public void setFlagged ()
//    public boolean isFlagged()
    public void setBomb()
    {

        this.bomb = true;

    }
    public boolean isBomb(MSCell[][] field , int dimension) //loop through array. if bomb == true, return true, else return false.
    {
        int y =0;
        for(int i =0;i <field.length ; i++)
        {
            for(int j = 0; j< field[dimension].length;j++)
            {
                if (bomb == true) {
                    y = 1;
                }
                else{y=-1;}
            }
        }
        if(y>0)
        {
            return true;
        }
        else {return false;}
    }
    public void setValue(MSCell[][] field, int dimension)
    {
        if(!isBomb( field, dimension))
        {
            value = 0;
        }
    }

    public int getValue()
    {
        return value;
    }

//    @Override
    public String toString(MSCell[][] field,int dimension)
    {
        if(isBomb(field, dimension))
        {
            return "\tX";
        }
        else{return  "\t"+getValue();}
    }

//
// this method is crucial!
//Here we overwrite the
//java method – check if it is a
//bomb – if so print a
}