package NOop12;

public class TriangleTest02 {
	public static void main(String[] agrs) {
		Triangle02 t1 = new Triangle02(10.0,5.0);
		Triangle02 t2 = new Triangle02(5.0,10.0);
		Triangle02 t3 = new Triangle02(8.0,8.0);
		
		System.out.println(t1.isSameArae(t2));
		System.out.println(t1.isSameArae(t3));
	}
}
class Triangle02 {
	private double A;
	private double B;
	public Triangle02(double A,double B) {
		this.A = A;
		this.B = B;
	}
	public boolean isSameArae(Triangle02 C) {
		return C.FindArea() == FindArea();
	}
	double FindArea() {
		return A*B/2;
	}
}