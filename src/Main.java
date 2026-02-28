import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        ArrayList<Mascota> lista = new ArrayList<>();

        int opcion;

        do {
            System.out.println("----- MENU LISTA MASCOTAS -----");
            System.out.println("1. Crear mascota");
            System.out.println("2. Mostrar todas");
            System.out.println("3. Buscar por nombre");
            System.out.println("4. Salir");
            System.out.print("Seleccione opcion: ");

            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {

                case 1:
                    System.out.println("Nombre:");
                    String nombre = teclado.nextLine();

                    System.out.println("Edad:");
                    int edad = teclado.nextInt();
                    teclado.nextLine();

                    System.out.println("Especie:");
                    String especie = teclado.nextLine();

                    System.out.println("Peso:");
                    double peso = teclado.nextDouble();
                    teclado.nextLine();

                    Mascota m = new Mascota(nombre, edad, especie, peso);
                    lista.add(m);

                    System.out.println("Mascota creada.");
                    break;

                case 2:
                    if (lista.isEmpty()) {
                        System.out.println("No hay mascotas.");
                    } else {
                        for (Mascota mascota : lista) {
                            mascota.mostrarInfo();
                            System.out.println("-----------------");
                        }
                    }
                    break;

                case 3:
                    System.out.println("Ingrese nombre a buscar:");
                    String buscar = teclado.nextLine();

                    Mascota encontrada = null;

                    for (Mascota Mascota : lista) {
                        if (Mascota.getNombre().equalsIgnoreCase(buscar)) {
                            encontrada = Mascota;
                            break;
                        }
                    }

                    if (encontrada != null) {

                        int sub;

                        do {
                            System.out.println("---- SUBMENU ----");
                            System.out.println("1. Alimentar");
                            System.out.println("2. Vacunar");
                            System.out.println("3. Cumplir anios");
                            System.out.println("4. Volver");
                            System.out.print("Opcion: ");

                            sub = teclado.nextInt();

                            switch (sub) {

                                case 1:
                                    System.out.println("Cantidad:");
                                    double cant = teclado.nextDouble();
                                    encontrada.alimentar(cant);
                                    break;

                                case 2:
                                    encontrada.vacunar();
                                    break;

                                case 3:
                                    encontrada.cumplirAnios();
                                    break;

                                case 4:
                                    break;

                                default:
                                    System.out.println("Opcion invalida.");
                            }

                        } while (sub != 4);

                    } else {
                        System.out.println("Mascota no encontrada.");
                    }

                    break;

                case 4:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opcion invalida.");
            }

        } while (opcion != 4);

        teclado.close();
    }
}