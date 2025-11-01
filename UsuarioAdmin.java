package patrones_ejercicio_2;

public class UsuarioAdmin extends Usuario {
	public UsuarioAdmin(String nombre) {
        super(nombre);
    }
    @Override
    public void mostrarTipo() {
        System.out.println("Soy un usuario ADMINISTRADOR: " + nombre);
    }
}
