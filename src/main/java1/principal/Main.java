package principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);
		Scanner sc4 = new Scanner(System.in);
		Scanner sc5 = new Scanner(System.in);

		int opcion;
		String E1, E2, E3, E4;
		int E5;
		String E6;
		String teclado;
		String teclado2;
		int pocicionDisponible = 0;
		int pocicionDisponible2 = 0;
		String B1, B2, B3, B4, B6, B7;
		int B5;

		Nacional vector[] = new Nacional[2];
		Importado vector2[] = new Importado[3];

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
					E6 = sc3.nextLine();

					vector[pocicionDisponible] = new Nacional(E1, E2, E3, E4, E5, E6);
					pocicionDisponible++;
				}

				if (teclado.equals("b")) {
					System.out.println("ingrese los datos");
					System.out.println("ingrese Marca");
					B1 = sc4.nextLine();
					System.out.println("ingrese Modelo");
					B2 = sc4.nextLine();
					System.out.println("ingrese Año fabricación");
					B3 = sc4.nextLine();
					System.out.println("ingrese Placa");
					B4 = sc4.nextLine();
					System.out.println("Kilometraje ");
					B5 = sc4.nextInt();
					System.out.println("ingrese codigo importe ");
					B6 = sc4.nextLine();
					System.out.println("ingrese Valor de la importación ");
					B7 = sc4.nextLine();

					vector2[pocicionDisponible2] = new Importado(B1, B2, B3, B4, B5, B6, B7);
					pocicionDisponible2++;

				}

			}
			if (opcion == 2) {
				System.out.println("Ingrse numero de placa");
				teclado2 = sc5.nextLine();
				if (teclado2.equals(vector)) {
					for (int i = 0; i < vector.length; i++) {
						if (vector[i] != null) {

							System.out.println(vector[i].getModelo() + vector[i].getMarca() + vector[i].getKilometraje()
									+ vector[i].getPlaca());
						}

					}

				}
				if (teclado2.equals(vector2)) {
					for (int i = 0; i < vector.length; i++) {
						if (vector2[i] != null) {
							System.out.println(vector2[i].getMarca() + vector2[i].getModelo()
									+ vector2[i].getKilometraje() + vector2[i].getPlaca());

						}

					}
				}
				if(!teclado2.equals(vector2)||!teclado2.equals(vector)) {
					System.out.println("no se encontro placa");
					
				}

			}
			
			if (opcion == 3) {
				
			}

		} while ((opcion == 5));

	}

}
