/**
 * 
 * @author dhan19
 *
 */
public class StringManipulator 

{
			public String noVowels(String str)
				{
					String name = "";
					for(int i = 0; i < str.length(); i++)
					{	
					
								if(str.charAt(i)=='a' || str.charAt(i)=='A' || str.charAt(i)=='e' || str.charAt(i)=='E' || str.charAt(i)=='i' || str.charAt(i)=='I' || str.charAt(i)=='o' || str.charAt(i)=='O' || str.charAt(i)=='u' || str.charAt(i)=='U')
								{
									name += "*";
								}
								else 
								{
									name += str.charAt(i);
									
								}
								
					}
					return name;
				}


		public String reverse(String str)
		{
			String name = "";
			for(int i = str.length(); i > 0; i--)
			{
				name += str.charAt(i - 1);
			}
			return name;
		}
}				
				

