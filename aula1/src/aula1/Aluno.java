package aula1;

public class Aluno {
	//attributes
	String nome;
	double media;
	
	
	//construtor
	public Aluno() {
		
	}
	
	//construtor
	public Aluno(String nome) {
		this.nome = nome;
	}
	
	//metodo para exibir dados do objeto
	void exibeEstado() {
		System.out.println("Media do aluno " + nome + " é " + media);
	}
	
}
