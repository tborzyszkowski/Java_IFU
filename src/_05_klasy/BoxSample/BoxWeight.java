package _05_klasy.BoxSample;

class BoxWeight extends Box {
	private double weight;

	public double getWeight() {
		return weight;
	}

	BoxWeight(BoxWeight ob) {
		super(ob);
		weight = ob.weight;
	}

	BoxWeight() {
		//super();
		weight = -1;
	}

	BoxWeight(int n, double weight) {
		super(n);
		this.weight = weight;
	}

	BoxWeight(double width, double height, double depth, double weight) {
		super(width, height, depth);
		this.weight = weight;
	}

	void setDim(double width, double height, double depth, double weight) {
		super.setDim(width, height, depth);
		this.weight = weight;
	}

	public String toString() {
		return "BoxWeight{ " + super.toString() + " Waga = " + weight + "}";
	}

}
