import java.util.Date;

public class Revistas {
	int codigo;
	String titulo;
	String tipo;
	// Propriedades/Atributos da edição
	// Configurados via setEdicao
	int numeroEdicao;
	int numeroArtigos;
	Date dataEdicao;
	
	public Revistas(String titulo, String tipo) {
		this.codigo = 1;
		this.titulo = titulo;
		this.tipo = tipo;
		this.setEdicao(1, 20, new Date());
	}
	
	public void setEdicao(int numEdicao, int numArtigos, Date dataEd) {
		this.numeroEdicao = numEdicao;
		this.numeroArtigos = numArtigos;
		this.dataEdicao = dataEd;
	}
	
	public void getEdicao() {
		System.out.println("Revistas:\n" + " Numero edicao: " + this.numeroEdicao + " | Numero de artigos: " + this.numeroArtigos + " | Data: " + this.dataEdicao);
	}
}
