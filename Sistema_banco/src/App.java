import java.util.Scanner;

public class App {

	public static void main(String args[]){
		
		Scanner leitor = new Scanner(System.in);
		String nome;
		String endereco;
		double saldoInicial;

		System.out.println("Abertura de conta bancária");

		Correntista correntista1 = new Correntista();
		correntista1.setNome("Rafael");

		Correntista correntista2 = new Correntista();
		
		System.out.println("Nome correntista1: " + correntista1.getNome() );
		System.out.println("Nome correntista2: " + correntista2.getNome() );
		
		ContaBancaria conta1 = new ContaBancaria();
		conta1.setNumero(1111);
		
		ContaBancaria conta2 = new ContaBancaria();
		
		System.out.println("Numero conta1: " + conta1.getNumero() );
		
		correntista1.setConta(conta1);
				
		Correntista correntista = conta1.getCorrentista();
		
		System.out.println("Nome: " + correntista.getNome());
		
		
		
		
		
		
		
		
		
		
		System.out.printf("Informe seu nome: ");
		nome = leitor.nextLine();

		System.out.printf("Informe seu endereço: ");
		endereco = leitor.nextLine();

		System.out.printf("Informe o valor do depósito inicial: ");
		saldoInicial = leitor.nextDouble();
		
		correntista1.setNome(nome);
		correntista1.setEndereco(endereco);
		correntista1.setConta(conta1);
		
		conta1.setNumero(0);
		conta1.depositar(saldoInicial);

		System.out.println("Nome: " 
				+ correntista1.getNome() 
				+ ", conta " 
				+ conta1.getNumero() 
				+ ", saldo: " 
				+ conta1.getSaldo());
		
		System.out.println(conta1.getCorrentista());
	
	}
	
}