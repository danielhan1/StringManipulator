/**
 * 
 * @author dhan19
 *
 */
public class DiceMain 
{	
		private int numRolls;
		
		public DiceMain()
		{
			numRolls = 0;
		}
		
			public int roll()
			{
				numRolls++;
				return (int)(Math.random()*6+1);
			}
			public void reset()
			{
				numRolls = 0;
			}

			public int getNumRolls() 
			{
			return numRolls;
}
}