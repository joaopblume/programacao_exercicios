
public class ContaBancaria {
	private int numero;
    private double saldo;
    private Correntista cc;
    
    public ContaBancaria(){    
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
    
    public void retirar(double valor){
    	if(this.saldo - valor >=0) {
    		this.saldo = this.saldo - valor;
    	}
    	else {
    		System.out.println("Valor indisponível!");
    	}
    	}
    public void depositar(double valor){
          this.saldo = this.saldo + valor;
    }
    public void transferir(double valor, ContaBancaria destino){
          if(saldo>=valor){
                 saldo = saldo - valor;
                 destino.depositar(valor);
          }else System.out.printf("Valor indisponível!\n");
    }
    
    public void setCorrentista(Correntista c) {
    	this.cc = c;
    	
    }
    public void getExtrato() {
    	System.out.printf("Nome: %s\n", cc.getNome());
    	System.out.printf("Numero da conta: %d\n", getNumero());
    	System.out.printf("Saldo: %.2f", this.saldo);
    	
    }
}
