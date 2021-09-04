
public class Correntista {
	private String nome;
	private String endereco;
	private ContaBancaria c;
	
	public Correntista()
	{
		
	}
	
	public Correntista (String nome, String endereco)
	{
		this.setNome(nome);
		this.setEndereco(endereco);
	}

	public String getEndereco() {
		return endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public ContaBancaria getC() {
		return c;
	}

	public void setConta(ContaBancaria c) {
		this.c = c;
		this.c.setCorrentista(this);
	}

	
}












