public class TestMS 
{
 public static void main (String[] args )
 {
	 int ROWS = 0;
	 int COLS = 0;
	 int BOMBS  =0;
	 
	if (args.length > 0) 
	{
		try 
		{
			 ROWS = Integer.parseInt(args[0]);
			 COLS = Integer.parseInt(args[1]);
			 BOMBS = Integer.parseInt(args[2]);
		} catch (NumberFormatException e)
		{
			System.err.println("Arguments must be an integer.");
			System.exit(1);
		}

	}
	MineField testField= new MineField (ROWS,COLS,BOMBS);
 }
}