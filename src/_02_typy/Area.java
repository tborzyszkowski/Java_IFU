package _02_typy;

// Obliczamy pole kola o zadanym promieniu
class Area {
	public static void main(String[] args) {
		double pi = Math.atan(1) * 4;
		float r = 10.0F;
		double p = pi * r * r;
		System.out.println("Pole kola o promieniu " + r + " wynosi " + p);
		// to samo przy uzyciu wbudowanego PI
		p = Math.PI * r * r;
		System.out.println("Pole kola o promieniu " + r + " wynosi " + p);

	}
}
