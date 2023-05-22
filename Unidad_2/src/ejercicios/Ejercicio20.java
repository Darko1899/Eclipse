package ejercicios;

public class Ejercicio20 {

	public static void main(String[] args) {
		int invitados = 7;
		int dulcesPorCadauno = 3;
		double CostoDulce = 13;
		int TotalDulces = invitados * dulcesPorCadauno;
		double GastoTotal = TotalDulces * CostoDulce;
		System.out.println("En total se consumieron: "+TotalDulces + "dulces en la fiesta");
		System.out.println("El gasto total por los dulces fue de $ "+GastoTotal);
	}

}
