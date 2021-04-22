
public class Editoras {
	int codEditora;
	String razaoSocial;
	String contato;
	String telefone;
	
	public Editoras() {
		this.codEditora = 1;
		this.razaoSocial = "MegaLivros LTDA.";
		this.contato = "contato@megalivros.com";
		this.telefone = "(81) 3346-7788";
	}
	
	public void listarDados() {
		System.out.println("Editora:\n" + " Codigo da editora: " + codEditora + " | Razao social: " + razaoSocial + " | Contato " + contato + " | Telefone: " + telefone);
	}
	
}
