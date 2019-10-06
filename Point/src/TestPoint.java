
public class TestPoint
{
	public static void main(String[] args)
	{
		Point point = new Point(3, 4);
		double distance = point.distanceFromOrigin();
		System.out.println("Distance from origin: " + distance);
		
		Point point2 = new Point(-3, -4);
		double distance2 = point2.distanceFromOrigin();
		System.out.println("Distance for (" 
		        + point2.getX() + ", " + point2.getY() + ") is " + distance2);
		var point3 = new Point(1, 1);
	}
}
