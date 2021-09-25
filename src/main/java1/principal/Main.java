package principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion;
		String T1, T2, T3, T4;
		int T5;
		String dentro;
		do {
			System.out.println("CONCESIONARIO AMBACAR");
			System.out.println("Escoja opcion: ");
			System.out.println("1) ingresar auto ");
			System.out.println("2) consultar auto: ");
			System.out.println("3) Actualizar Kilometraje: ");
			System.out.println("4) Imprimir Reporte: ");
			System.out.println("5) SALIR: ");
			opcion = sc.nextInt();

			if (opcion == 1) {
				System.out.println("seleccioneuna opcion");
				System.out.println("a)Auto Nacional");
				System.out.println("b)Auto Importado ");
				dentro = sc.nextLine();
				if (dentro.equals("a")) {
					System.out.println(" ingrese los datos");
					System.out.println("ingrese Marca");
					T1 = sc.nextLine();
					System.out.println("ingrese Modelo");
					T2 = sc.nextLine();
					System.out.println("ingrese Año fabricación");
					T3 = sc.nextLine();
					System.out.println("ingrese Placa");
					T4 = sc.nextLine();
					System.out.println("Kilometraje ");
					T5 = sc.nextInt();
					

				}
				if (dentro.equals("b")) {
					
				}
			}

		} while (opcion != 5);

	}

}
