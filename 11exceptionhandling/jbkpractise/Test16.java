package exceptionhandling.jbkpractise;

public class Test16 {

	public static void main(String[] args) {
		try
		{
			String str="easysteps2webbuildwesitemxxmsx,szmxn";
			char c=str.charAt(0);
			c=str.charAt(40);
			System.out.println(c);
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("String Index out of Bound Exception");
		}
	}
}
