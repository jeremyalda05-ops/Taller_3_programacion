package patrones_ejercicio_2;

public class Usuario {
	protected String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    // Método que variará según el tipo de usuario
    public void mostrarTipo() {
        System.out.println("Soy un usuario general");
    }
}
