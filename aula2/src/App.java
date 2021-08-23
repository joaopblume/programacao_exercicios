import java.util.Scanner;


public class App {

	public static void main(String[] args) {
		Atleta rodrigo = new Atleta();
		rodrigo.mostrarValores();
		
		Atleta rafael = new Atleta("Rafael", 43);
		rafael.setIdade(34);
		rafael.mostrarValores();
		
		System.out.println("Leitura do nome: " + rafael.getNome());
		System.out.println("Leitura da idade: " + rafael.getIdade());
		
		System.out.println("Digite o nome do atleta: ");
		Scanner leitor = new Scanner(System.in);
		String name = leitor.nextLine();
		
		//limpando o buffer
		leitor.nextLine();
	
		
		System.out.println("Digite a idade do atleta: ");
		int num = leitor.nextInt();
		
		Atleta joao = new Atleta();
		joao.setNome(name);
		joao.setIdade(num);
		joao.mostrarValores();
		
		
	}

}
