package apple;

public class thermos {
	float liters;
	String brand;
	String Liquid;
	
	thermos(String x,String y)
	{
		liters=0;
		brand=x;
		Liquid=y;
	}
	
	void addLiq(float x)
	{
		liters=liters+x;
	}
	
	void details()
	{
		System.out.println("Brand : "+brand+"\nLiquid : "+Liquid+"Liter : "+liters);
		
	}
	
	public static void main(String args[]) {

		
	}
}
