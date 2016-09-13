/**
 * Created by Willem Swarts on 9/9/2016.
 */
public class MineField
{
    private MSCell field[][];
    private final int ROWS;
    private final int COLS;
    private final int BOMBS;
    public MineField (int x, int
            y, int b)
    {
        this.ROWS = x;
        this.COLS = y;
        this.BOMBS = b;
    }
    public void initialiseField(int l, int b) // takes length(l) and width (b) as parameters
    {                                         // and draws the field.
        MSCell field[][] = new MSCell[l][b];
        for(int i=0,j = 0; i<l && j< b; i++,j++)
        {
            field[i][j]  ;
        }
//    public void plantBombs()
//    // Plant BOMBS number of
//    //Random bombs
//    public void displayField()
//    // use toString
//    //IMPLICITLY!!!!
//    // check output on next
//    //page
}
//NOTE:
//        The size of the declared array
//        should come from the
//        command line parameters in
//        the test programme