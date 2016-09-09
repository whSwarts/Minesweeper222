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
    public void initialiseField()
    {

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