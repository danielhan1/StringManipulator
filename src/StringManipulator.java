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
					for(int i = 0; i < (str.length()); i++)
					{	
					
								if(str.charAt(i)=='a' || name.charAt(i)=='e' || name.charAt(i)=='i' || name.charAt(i)=='o' || name.charAt(i)=='u')
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
}
	
					
							
				

