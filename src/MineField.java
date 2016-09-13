/**
 * Created by Willem Swarts on 9/9/2016.
 */
import java.util.Random;
public class MineField {
    private MSCell field[][];
    private final int ROWS;
    private final int COLS;
    private final int BOMBS;

    public MineField(int x, int
            y, int b) {
        this.ROWS = x+1;
        this.COLS = y+1;
        this.BOMBS = b;
    }

    public void initialiseField(int l, int b) // takes length(l) and width (b) as parameters
    {                                         // and draws the field.
        MSCell field[][] = new MSCell[l][b];
        for (int i = 0, j = 0; i < l && j < b; i++, j++) {
            field[i][j] = new MSCell();
        }
    }
    public void plantBombs(int numBombs, int dimension)
    {
       initialiseField(ROWS,COLS);
       Random rand = new Random();
       for(int i=0; i<numBombs;i++)
       {
            int randomCOl = rand.nextInt(field.length);
            int randomRow = rand.nextInt(field[dimension].length);
            field[randomCOl][randomRow].setBomb();
       }
    }
//    // Plant BOMBS number of
//    //Random bombs
//    public void displayField()
//    // use toString
//    //IMPLICITLY!!!!
//    // check output on next
//    //page

//NOTE:
//        The size of the declared array
//        should come from the
//        command line parameters in
//        the test programme
}