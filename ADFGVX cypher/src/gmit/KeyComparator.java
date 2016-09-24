package gmit;

import java.util.Comparator;

public class KeyComparator implements Comparator<KeyColumn>{
	
	public int compare(KeyColumn current, KeyColumn next)
	{
		//all O(1)
		if(current.getKeyCharacter() < next.getKeyCharacter())
		{
			return -1;
		}
		else if(current.getKeyCharacter() > next.getKeyCharacter())
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}//compare

}
