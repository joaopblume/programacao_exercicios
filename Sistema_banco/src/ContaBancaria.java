public class ContaBancaria {

	private int numero;
	private double saldo;
	private Correntista c;

	public ContaBancaria(){    
	}
	
	public ContaBancaria(int numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	//método retirar
	public void retirar(double valor) {
		if(saldo>=valor){
			saldo = saldo - valor;
		}else System.out.printf("Valor indisponível!\n");
	}

	public void depositar(double valor){
		saldo = saldo + valor;
	}

	public void transferir(double valor, ContaBancaria destino){
		if(saldo>=valor){
			saldo = saldo - valor;
			destino.depositar(valor);
		}else System.out.printf("Valor indisponível!\n");
	}

	public void setCorrentista(Correntista c) {
		this.c = c;
	}
	
	public Correntista getCorrentista() {
		return c;
	}
}