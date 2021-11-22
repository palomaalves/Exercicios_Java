
public class Principal {

	public static void main(String[] args) {
		/*------------Cozinha-------------*/
		Cozinha cozinha = new Cozinha();
		cozinha.setAmericana(false);
		cozinha.setMetragemQuadrada(40);
		PortaCozinha portaCozinha = new PortaCozinha();
		portaCozinha.setCor("Azul");
		portaCozinha.setAltura(3.05f);
		portaCozinha.setLargura(1.50f);
		portaCozinha.setPeso(5);
		
		System.out.println("Cozinha eh "+ cozinha.isAmericana() +" do tipo Americana,"
				+" com "+ cozinha.getMetragemQuadrada() +" m2 e com uma porta de cor "
				+ portaCozinha.getCor() +", medindo "+ portaCozinha.getAltura() +"m x "
				+ portaCozinha.getLargura() +"m e com o peso de "+ portaCozinha.getPeso() 
				+" Kg. "+ portaCozinha.fechar()+".");
		
		/*------------Quarto-------------*/
		Quarto quarto = new Quarto();
		quarto.setBanheiro(true);
		quarto.setMetragemQuadrada(20);
		PortaQuarto portaQuarto = new PortaQuarto();
		portaQuarto.setCor("Branca");
		portaQuarto.setAltura(3.05f);
		portaQuarto.setLargura(1.50f);
		portaQuarto.setPeso(5);
		
		System.out.println("O quarto possui banheiro: "+ quarto.isBanheiro() +". "
				+"Possui "+ quarto.getMetragemQuadrada() +" m2, com uma porta de cor "
				+ portaQuarto.getCor() +", medindo "+ portaQuarto.getAltura() + "m x "
				+ portaQuarto.getLargura() +"m e com o peso de "+ portaQuarto.getPeso()
				+" Kg. " + portaQuarto.abrir()+".");
		
		/*------------Sala-------------*/
		Sala sala = new Sala();
		sala.setMetragemQuadrada(50);
		PortaSala portaEntrada = new PortaSala();
		portaEntrada.setCor("Branca");
		portaEntrada.setAltura(5.50f);
		portaEntrada.setLargura(2.00f);
		portaEntrada.setPeso(15);
		PortaSala portaAuxiliar = new PortaSala();
		portaAuxiliar.setCor("Cinza");
		portaAuxiliar.setAltura(3.20f);
		portaAuxiliar.setLargura(1.00f);
		portaAuxiliar.setPeso(9);

		
		System.out.println("A sala possui "+ sala.getMetragemQuadrada() + 
				" m2, com uma porta de cor "+ portaEntrada.getCor() +", medindo "
				+ portaEntrada.getAltura() + "m x "+ portaEntrada.getLargura() +
				"m e com o peso de "+ portaEntrada.getPeso()+" Kg. " + 
				portaEntrada.abrir()+".\nE tambem possui uma porta auxiliar de cor "+ 
				portaAuxiliar.getCor() +", medindo "+ portaAuxiliar.getAltura() + "m x "
				+ portaAuxiliar.getLargura() +"m e com o peso de "+ portaAuxiliar.getPeso()
				+" Kg. " + portaAuxiliar.fechar());
	}

}
