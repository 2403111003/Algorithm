package NOop12;

public class TriangleTest {
	public static void main(String[] agrs) {
		Triangle t1 = new Triangle(10.0,5.0);
		System.out.println(t1.FindArea());
	}
}
class Triangle {
	private double A;
	private double B;
	public Triangle(double A,double B) {
		this.A = A;
		this.B = B;
	}
	double FindArea() {
		return 0.5*A*B;
	}
}