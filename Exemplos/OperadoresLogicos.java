public class OperadoresLogicos {
	public static void main(String[] args) {

		int a = 10;
 		int b = 20;
 		boolean c = true;

		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);

		System.out.println("valor a < b && c =" + (a < b && c)); // Saída: true
		System.out.println("valor a > b || c =" + (a > b || c)); // Saída: true
		System.out.println("valor !c =" + (!c)); // Saída: false
	}
}