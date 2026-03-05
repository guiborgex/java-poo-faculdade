package main;

public class Main {

	public static void main(String[] args) {
		/* System.out.println("Meu nome é Prof. Flores"); */
		// TODO Auto-generated method stub

		Carro carro1 = new Carro("Fusca", "verde", 1980);
		System.out.println("A marca do carro é " + carro1.getMarca());
		System.out.println("O carro vai buzinar: " + carro1.buzinar());
		System.out.println("-------------------------------------");
		
		Trator carro2 = new Trator("New Holand", "amarelo", 1999, true, false);
		System.out.println("A marca do trator é " + carro2.getMarca());
		System.out.println(carro2.descricaoCabine());
		System.out.println(carro2.descricaoConcha());
		System.out.println("O trator vai buzinar: " + carro2.buzinar());
	}

}
