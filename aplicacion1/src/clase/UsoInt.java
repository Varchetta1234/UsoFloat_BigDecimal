package clase;

public class UsoInt {
	public static void main(String[] args) {
		int caramelosComprados = 0;
		int centavos = 100;
		for (int precio = 10; centavos >= precio; precio += 10) {
		caramelosComprados++;
		centavos -= precio;
		}
		System.out.println(caramelosComprados + " caramelos comprados.");
		System.out.println("Vuelto: "+ centavos + " centavos");
		}

}
