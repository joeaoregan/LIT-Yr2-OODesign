// The Echo example displays each of its command-line arguments on a line by itself:

public class Echo 
{ 
	public static void main (String[] args) 
	{ 
		for (String s: args) 
		{ 
			System.out.println(s); 
		} 
	} 
}