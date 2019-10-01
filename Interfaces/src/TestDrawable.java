
public class TestDrawable
{
	public static void main(String[] args)
	{
		Circle circle = new Circle();
		circle.draw();
		circle.fillWithRedColor();
		circle.drawWithPen();
		
		Drawable draw = new Circle();
		draw.draw();
		
		draw = new Square();
		draw.draw();
    }
}
