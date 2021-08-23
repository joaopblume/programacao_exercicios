
public class Correntista {
	private String nome;
	private String endereco;
	private ContaBancaria c;
	
	public Correntista(String nome, String endereco, ContaBancaria conta) {
		this.nome = nome;
		this.endereco = endereco;
		this.c = conta;
	}
	
	public String getNome(){
		return nome;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
}
