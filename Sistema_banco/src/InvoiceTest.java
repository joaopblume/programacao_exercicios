
public class InvoiceTest {
	public static void main(String[] args) {
		
		Invoice myInvoice = new Invoice();
		
		myInvoice.setNumero("A1234");
		myInvoice.setDescricao("Produto A1234 � uma ferramenta");
		myInvoice.setPreco(23.50);
		myInvoice.setQuantidade(20);
		
		System.out.println("Numero: " + myInvoice.getNumero());
		System.out.println("Descri��o: " + myInvoice.getDescricao());
		System.out.println("Pre�o: " + myInvoice.getPreco());
		System.out.println("Quantidade: " + myInvoice.getQuantidade());
		
		System.out.println("Quantidade da fatura: " + myInvoice.getInvoiceAmount());
	}
}
