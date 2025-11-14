package h2;

public class H2_main 
{
	public static void main (String args [])
	{
		boolean a = true;
		boolean b = false;
		boolean c = true;
		boolean x = false;
		boolean y = true;
		
		int input = 10;
		
		
		
		if ( input == 10 || input == 11)
		{
			x = true;
		}
		else
		{
			x = false;
		}
		
		if (input == 11 || input == 1)
		{
			y = true;
		}
		{
			y = false;
		}
		
		
		
		if (x==true && y==true)
		{
			a = true;
		}
		else
		{
			a = false;
		}
		
		if (x == true || x!=y)
		{
			b = true;
		}
		else
		{
			b = false;
		}
		
		
		if (y== false)
		{
			c = true;
		}
		else
		{
			c = false;
		}
		
		
		System.out.println ("x="+x+"y="+y+"a="+a+"b="+b+"c="+c);
	}

}
