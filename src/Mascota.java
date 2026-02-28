public class Mascota {

    private String nombre;
    private String especie;
    private int edad;
    private double peso;
    private boolean vacunado;

    public Mascota() {
    }

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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isVacunado() {
        return vacunado;
    }

    public void setVacunado(boolean vacunado) {
        this.vacunado = vacunado;
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "nombre='" + nombre + '\'' +
                ", especie='" + especie + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                ", vacunado=" + vacunado +
                '}';
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
        System.out.println("La mascota ahora tiene " + edad + " años.");
    }
    public void Vacunar() {
        this.vacunado=true;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad);
        System.out.println("Peso: " + peso);
        System.out.println("Vacunado: " + vacunado);
    }
}