package patrones_ejercicio_2;

public class UsuarioInvitado extends Usuario {
	public UsuarioInvitado(String nombre) {
        super(nombre);
    }
    @Override
    public void mostrarTipo() {
        System.out.println("Soy un usuario INVITADO: " + nombre);
    }
}


