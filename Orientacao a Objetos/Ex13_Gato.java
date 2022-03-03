package aulas.oo;

import java.util.Objects;

public class Ex13_Gato {

	private String nome;
	private String cor;
	private String idade;
	
	public Ex13_Gato() {
	}

	public Ex13_Gato (String nome, String cor, String idade) {

		this.nome = nome;
		this.cor = cor;
		this.idade = idade;
	}

	@Override
	public String toString() {

		return "Gato [nome=" + nome + ", cor=" + cor + ", idade=" + idade + "]";
	}

	@Override
	public int hashCode() {

		return Objects.hash(cor, idade, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		aulas.oo.Ex13_Gato other = (aulas.oo.Ex13_Gato) obj;
		return Objects.equals(cor, other.cor) && Objects.equals(idade, other.idade) && Objects.equals(nome, other.nome);
	}

	public String getNome() {

		return nome;
	}

	public void setNome(String nome) {

		this.nome = nome;
	}

	public String getCor() {

		return cor;
	}

	public void setCor(String cor) {

		this.cor = cor;
	}

	public String getIdade() {

		return idade;
	}

	public void setIdade(String idade) {

		this.idade = idade;
	}
	
	/*public Gato(String nome, String cor, Integer idade) {
		this.nome = nome;
		this.cor = cor;
		this.idade = idade;
	}*/
	
}