public class Point
{
	private double x;
	private double y;

	public double distanceFromOrigin()
	{
		return Math.sqrt(x * x + y * y);
	}
//constructor	
	public Point(double a, double b) 
	{
		x = a;
		y = b;
	}
	
	// getters and setters
	
	public double getX()
	{
		return x;
	}
	
	public double getY()
	{
		return y;
	}
}




