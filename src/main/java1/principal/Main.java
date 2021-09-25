package principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		int opcion;
		String E1, E2, E3, E4 , E6;
		int E5;
		String teclado;
		int pocicionDisponible = 0;
		Nacional vector[] = new Nacional[2];
		
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
				
				System.out.println(" a)Auto Nacional");
				System.out.println(" b)Auto Importado ");
				teclado = sc2.nextLine();
				
	
				if (teclado.equals("a")) {
					System.out.println("ingrese los datos");
					System.out.println("ingrese Marca");
					E1 = sc2.nextLine();
					System.out.println("ingrese Modelo");
					E2 = sc2.nextLine();
					System.out.println("ingrese Año fabricación");
					E3 = sc2.nextLine();
					System.out.println("ingrese Placa");
					E4 = sc2.nextLine();
					System.out.println("Kilometraje ");
					E5 = sc2.nextInt();
					System.out.println("ingrese codigo nacional ");
					E6 = sc2.nextLine();
					
					vector[pocicionDisponible] = new  Nacional(E1, E2, E3, E4, E5, E6);
					pocicionDisponible++;

				}
				
				if (teclado.equals("b")) {
					
				}
				}
				
			
			

		} while ((opcion == 5));

	}

}
