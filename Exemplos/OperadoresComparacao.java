public class OperadoresComparacao {
	public static void main(String[] args) {

		int a = 10;
 		int b = 20;

		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("valor a == b = " + (a == b)); // Saída: false
		System.out.println("valor a != b = " + (a != b)); // Saída: true
		System.out.println("valor a > b = " + (a > b));  // Saída: false
		System.out.println("valor a < b = " + (a < b));  // Saída: true
		System.out.println("valor a >= b = " + (a >= b)); // Saída: false
		System.out.println("valor a <= b = " + (a <= b)); // Saída: true
	}
}