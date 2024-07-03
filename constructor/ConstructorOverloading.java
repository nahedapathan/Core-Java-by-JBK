package in.tka.constructor;

public class ConstructorOverloading {

	private int rollNum;
	
	ConstructorOverloading()
	{
		rollNum=100;
		
	}
	ConstructorOverloading(int mum)
	{
		rollNum=rollNum+mum;
	}
	
	public int getRollNum()
	{
		return rollNum;
	}
	
	public void setRollNum(int rollNum)
	{
		this.rollNum=rollNum;
	}
}
