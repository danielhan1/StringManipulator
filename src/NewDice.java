/**
 * 
 * @author dhan19
 *
 */
public class NewDice
{
		public static void main(String[] args)
		{
			DiceMain dice = new DiceMain();
			int count=0;
			int roll = dice.roll();
			System.out.print(roll);
			if(roll== 3)
			{
				count++;
			}
			roll = dice.roll();
			System.out.println(roll);
			if(roll== 3)
			{
				count++;
			}
			roll = dice.roll();
			System.out.println(roll);
			if(roll== 3)
			{
				count++;
			}
			roll = dice.roll();
			System.out.println(roll);
			if(roll== 3)
			{
				count++;
			}
			roll = dice.roll();
			System.out.print(roll);
			if(roll== 3)
			{
				count++;
			}
			roll = dice.roll();
			System.out.print(roll);
			if(roll== 3)
			{
				count++;
			}roll = dice.roll();
			System.out.print(roll);
			if(roll== 3)
			{
				count++;
			}roll = dice.roll();
			System.out.print(roll);
			if(roll== 3)
			{
				count++;
			}roll = dice.roll();
			System.out.print(roll);
			if(roll== 3)
			{
				count++;
			}roll = dice.roll();
			System.out.print(roll);
			if(roll== 3)
			{
				count++;
			}
			
			
			System.out.println("you rolled" + count + "threes.");
		}
		
		
}
