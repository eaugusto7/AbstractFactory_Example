package AbstractFactory;

import java.util.Scanner;

public class TesteFactory {
	private static Carro montarCarro(String tipo){
		CarroFactory cf = null;
		switch(tipo){
			case "luxo":
				cf = new CarroLuxoFactory();
				break;
			case "popular":
				cf = new CarroPopularFactory();
		}
		Carro carro = new Carro();
		carro.setRoda(cf.montarRoda());
		carro.setSom(cf.montarSom());
		
		return carro;
	}
	
	public static void main(String args[]){
		Scanner captura = new Scanner(System.in);
		
		System.out.print("Digite o tipo de Carro[popular/luxo]: ");
		Carro c1 = montarCarro(captura.next());
		
		System.out.print("Digite o tipo de Carro[popular/luxo]: ");
		Carro c2 = montarCarro(captura.next());
	
		System.out.println("Fim da Execução");
	}
}
