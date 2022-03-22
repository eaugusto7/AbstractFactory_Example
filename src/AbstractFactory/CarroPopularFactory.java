package AbstractFactory;

public class CarroPopularFactory extends CarroFactory{

	@Override
	public Roda montarRoda() {
		System.out.println("Carro popular");
		System.out.println("Roda simples montada");
		return new RodaSimples();
	}

	@Override
	public Som montarSom() {
		System.out.println("TocaFitas montado\n");
		return new TocaFitas();
	}
	
}
