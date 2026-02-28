import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre:");
        String nombre = sc.nextLine();

        System.out.println("Ingrese la edad:");
        int edad = sc.nextInt();
        sc.nextLine();

        System.out.println("Ingrese la especie:");
        String especie = sc.nextLine();

        System.out.println("Ingrese el peso:");
        double peso = sc.nextDouble();

        Mascota mascota = new Mascota(nombre, edad, especie, peso);

        int opcion;

        do {
            System.out.println("----- MENU -----");
            System.out.println("1. Mostrar informacion");
            System.out.println("2. Alimentar");
            System.out.println("3. Vacunar");
            System.out.println("4. Cumplir anios");
            System.out.println("5. Mostrar informacion final y salir");
            System.out.print("Seleccione una opcion: ");

            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    mascota.mostrarInfo();
                    break;

                case 2:
                    System.out.println("Ingrese cantidad de alimento:");
                    double cantidad = sc.nextDouble();
                    mascota.alimentar(cantidad);
                    break;

                case 3:
                    mascota.vacunar();
                    break;

                case 4:
                    mascota.cumplirAnios();
                    break;

                case 5:
                    System.out.println("Informacion final:");
                    mascota.mostrarInfo();
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opcion invalida.");
            }

        } while (opcion != 5);

        sc.close();
    }
}