package gmit;

import java.util.ArrayList;
import java.util.List;

public class KeyColumn 
{
	private char keyCharacter;
	private int index=0;
	private List<Character> chars = new ArrayList<Character>();
	List<KeyColumn> matrix =new ArrayList<KeyColumn>();

	public KeyColumn(int index, char key)
	{
		this.keyCharacter=key;
		this.index=index;
	}
	
	public void add(int index, char c)
	{
		chars.add(index, c);
	}
		
	public char get(int index)
	{
		return chars.get(index);
	}
	
	public int getIndex()
	{
		return this.index;
	}
	public char getKeyCharacter()
	{
		return this.keyCharacter;
	}

}