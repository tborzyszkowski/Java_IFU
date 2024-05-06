package _05_klasy.BoxSample;

public class Box {
	private double width = 0;
	private double height = 0;
	private double depth = 0;

	public Box(double width, double height, double depth) {
		this.setDim(width, height, depth);
	}
	public Box(){
		this(0.0, 0.0, 0.0);
	}

	public Box(BoxWeight ob) {
		this(ob.getWidth(), ob.getHeight(), ob.getDepth());
	}

	public Box(int n) {
		this(n, n, n);
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getDepth() {
		return depth;
	}

	public void setDepth(double depth) {
		this.depth = depth;
	}

	void setDim(double width, double height, double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	public double volume(){
		return this.height * width * depth;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Box)) return false;

		Box box = (Box) o;

		if (Double.compare(getWidth(), box.getWidth()) != 0) return false;
		if (Double.compare(getHeight(), box.getHeight()) != 0) return false;
		return Double.compare(getDepth(), box.getDepth()) == 0;
	}

	@Override
	public int hashCode() {
		int result;
		long temp;
		temp = Double.doubleToLongBits(getWidth());
		result = (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(getHeight());
		result = 31 * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(getDepth());
		result = 31 * result + (int) (temp ^ (temp >>> 32));
		return result+super.hashCode();
	}

	//	public static int getValue(int argument){
	//		return argument + 1;
	//	}
	public String toString() {
		return  "Box { Objetosc = " + this.volume() + " }";
	}

}
