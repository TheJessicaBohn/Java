public class OperadoresUnarios {
	public static void main(String[] args) {

		int a = 10;
		int b = 14;
		int c = b--; //precedência, primeiro ele atribui o valor de b, e b vale 14, e depois ele faz a operação...isso se chama pós decremento
		int d = --a; //pre decremento

		a++; // Equivalente a a = a + 1;

		System.out.println("a++:" +a); // Saída: 11
		System.out.println("b--:"+b); // Saída: 13
		System.out.println("c:"+c); // Saída: 14
		System.out.println("d = --a:"+d); // Saída: 9
	}
}