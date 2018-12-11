package vezbe5.primer1;

public class Pixel extends Point2D{

	protected String color;
	
	public Pixel(double x, double y, String color) {
		super(x, y);
		this.color = color;
	}

	@Override
	public void ispisNaEkran() {
		System.out.println("Ispis piksela ekrana boje " + color + " na kordinati (" + x + "," + y + ")");
	}
}
