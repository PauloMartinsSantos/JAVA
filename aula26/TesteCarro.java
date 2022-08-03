package aula26;

public class TesteCarro {
	public static void main(String[] args) {
		Carro van = new Carro();
		
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		System.out.println("Marca: "+van.marca);
		System.out.println("Modelo: "+van.modelo);
		
		van.exibirAautonomia();
		
		double autonomia = van.obterAutonomia();
		
		System.out.println("A autonomia do carro é: "+autonomia+ " km // Informação chamada pelo metodo com retorno");
		
		System.out.println("---------------------------------------------------------------------------------------");
		
		Carro sedan = new Carro();
		
		sedan.marca = "Chevrolet";
		sedan.modelo = "Prisma";
		sedan.numPassageiros = 5;
		sedan.capCombustivel = 54;
		sedan.consumoCombustivel = 8.9;
		
		System.out.println("Marca: "+ sedan.marca);
		System.out.println("Modelo: "+ sedan.modelo);
		
		
		
		System.out.println("A autonomia do carro "+sedan.modelo+ " é de "+sedan.obterAutonomia() + "Km");
		
		
		
		
	}

}
