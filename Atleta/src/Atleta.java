public class Atleta {
	String nome;
	private int idade;
	
	// metodos construtores servem para inicilizar os atributos da classe
	
	// metodo construtor
	Atleta(){
		nome = "Não informado";
		idade = 0;
	}
	
	// metodo construtor
	Atleta(String nome, int idade){
		this.nome = nome;
		this.idade = idade;
	}
	
	void setIdade(int idade) {
		if(idade > 0)
			this.idade = idade;
	}
	
	void setNome(String nome){
		this.nome = nome;
	}
	
	int getIdade(){
		return idade;
	}
	
	String getNome(){
		return nome;
	}
	
	void mostrarValores(){
		System.out.println("Nome: " + nome + ", Idade: " + idade);
	}
}

