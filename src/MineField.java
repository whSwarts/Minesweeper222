import java.util.Random;
public class MineField
{
	private MSCell field[][];
	private final  int ROWS;
	private final int COLS;
	private final int BOMBS;
	
	public MineField (int x, int y, int b)
	{
		
	    ROWS = x;
		COLS = y;
		BOMBS = b;
		field= new MSCell[ROWS][COLS];
		initialiseField();
		plantBombs();//PLANT THE BOMBS!!!!!!!!!!!!!!
		displayField();
	}
	public void initialiseField()
	{
		for (int i=0; i<ROWS;i++)
		{
			for (int j=0; j<COLS; j++)
			{
				field[i][j]=new MSCell();
			}
		}
	}
	
	public void plantBombs()
	{
		Random randomNumbers = new Random();
		//plant BOMBS number of bombs randomly in grid
		int bombsPlanted=0;
		int bombRow = 0;
		int bombCol = 0;
		while (bombsPlanted < BOMBS)
		{
			bombRow = randomNumbers.nextInt(ROWS); //produce random number from 0-ROWS-1
			bombCol = randomNumbers.nextInt(COLS);
		//	System.out.println( bombRow +" " + bombCol);
			if (!field[bombRow][bombCol].isBomb()) // if not yet bomb
			{
				 field[bombRow][bombCol].setBomb();
				 bombsPlanted++;
			}
			
		}
		
	}
	public void displayField()
	{
		System.out.printf("\n\n");
		for (int j=-1; j<COLS; j++)
			{
				System.out.printf("%2s ",j+1);
			}
		System.out.printf("\n");
		for (int i=0; i<ROWS;i++)
		{
			System.out.printf("%2s ", i+1);
			for (int j=0; j<COLS; j++)
			{
				System.out.printf("%2s ",field[i][j]);
			}
			System.out.printf("\n");
			
		}
	}
	
}