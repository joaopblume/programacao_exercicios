
public class App {
	public static void main(String args[]){

        ContaBancaria c1 = new ContaBancaria();

        ContaBancaria c2 = new ContaBancaria();

        c1.setNumero(31);

        c2.setNumero(38);

        c1.depositar(500);

        c1.transferir(200, c2);
        
        System.out.printf("Saldo da conta %d: %.2f\n", c1.getNumero(), c1.getSaldo());

        System.out.printf("Saldo da conta %d: %.2f\n", c2.getNumero(), c2.getSaldo());
        
        Correntista correntista1 = new Correntista("Jo�o", "S�o Leopoldo", c1);
        c1.setCorrentista(correntista1);
        
        System.out.println("Correntista, nome: " + correntista1.getNome());
        
        c1.getExtrato();
	}
}
