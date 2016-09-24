package gmit;

import java.util.Comparator;

public class IndexComparator implements Comparator<KeyColumn>{
	
	public int compare(KeyColumn current, KeyColumn next)
	{
		//all O(1)
		if(current.getIndex() < next.getIndex())
		{
			return -1;
		}
		else if(current.getIndex() > next.getIndex())
		{
			return 1;
		}
		else
		{
			return 0;
		}	
	}//compare

}
