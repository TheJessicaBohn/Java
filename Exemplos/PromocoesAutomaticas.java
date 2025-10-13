public class PromocoesAutomaticas {
	public static void main(String[] args) {
		byte a = 10;
		int b = a + 5; // a é promovido antes do calculo;

		float c = 1.5f; // é importante por o f se não ele entende como double
		float d = b * c;  // b é promovido antes do calculo

		double e = 1.5;
		double f = b * e;

		System.out.println("Valor de a = " + a);
		System.out.println("Valor de d = " + d);
		System.out.println("Valor de f = " + f);
	}
}