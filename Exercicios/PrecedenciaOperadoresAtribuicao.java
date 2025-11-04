public class PrecedenciaOperadoresAtribuicao {
	public static void main(String[] args) {
	int numero = 5;

	System.out.println("Pré-incremento (++numero): " + (++numero)); 

	System.out.println("Pós-incremento (numero++): " + (numero++));
	
	System.out.println("Valor após o pós-incremento: " + numero);

	System.out.println("Pré-decremento (--numero): " + (--numero));

	System.out.println("Pós-decremento (numero--): " + (numero--));
	
	System.out.println("Valor após o pós-decremento: " + numero);
	}
}
