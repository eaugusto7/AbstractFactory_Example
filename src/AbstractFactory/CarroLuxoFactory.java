package AbstractFactory;

public class CarroLuxoFactory extends CarroFactory{

	@Override
	public Roda montarRoda() {
		System.out.println("Carro de Luxo");
		System.out.println("Roda de liga leve montada");
		return new RodaLigaLeve();
	}

	@Override
	public Som montarSom() {
		System.out.println("Cd player montado\n");		
		return new CDPlayer();
	}

}
