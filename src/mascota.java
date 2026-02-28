public class mascota {

    private String nombre;
    private String especie;
    private int edad;
    private double peso;
    private boolean vacunado;

    public Mascota(String nombre, int edad, String especie, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
        this.peso = peso;
        this.vacunado = false;
    }

    public void vacunar() {
        vacunado = true;
        System.out.println("La mascota ha sido vacunada.");
    }

    public void alimentar(double cantidad) {
        if (cantidad > 0) {
            peso += cantidad;
            System.out.println("La mascota fue alimentada.");
        } else {
            System.out.println("No se permiten cantidades negativas.");
        }
    }

    public void cumplirAnios() {
        edad = edad + 1;
        System.out.println("La mascota ahora tiene " + edad + " anios.");
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad);
        System.out.println("Peso: " + peso);
        System.out.println("Vacunado: " + vacunado);
    }
}