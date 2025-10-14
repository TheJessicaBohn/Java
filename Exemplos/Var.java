public class Var {
	public static void main(String args[]) {

	//inferência é algo implicito
	// var só pode ser usado para declara variaveis locais e com inicializadores, pois null o compilador não consegue "adivinha o tipo"

		var numero = 10; //infere que é int

		System.out.print("Valor de numero = "+ numero);
	}
}