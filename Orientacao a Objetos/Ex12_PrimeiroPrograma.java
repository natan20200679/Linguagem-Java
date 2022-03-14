package aulas.oo;

public class Ex12_PrimeiroPrograma {
	public static void main(String[] args) {

		aulas.oo.Ex13_Gato gato = new aulas.oo.Ex13_Gato();
		Livros livros = new Livros();
		System.out.println(gato);
		System.out.println(livros);
		int a = 2;
		int b = 3;
		System.out.println("Hello World!" + (a + b));
	}
}

class Livros {

	private String nome;
	private String npag;
}