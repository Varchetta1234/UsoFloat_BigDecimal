package clase;
// Error: ¡utiliza punto flotante para el cálculo monetario!

public class UsoDouble {
	public static void main(String[] args) {
	double funds = 1.00;
	int itemsBought = 0;
	for (double price = .10; funds >= price; price += .10) {
	funds -= price;
	itemsBought++;
	}
	System.out.println(itemsBought + " caramelos comprados.");
	System.out.println("Vuelto: $" + funds);
	}

}
