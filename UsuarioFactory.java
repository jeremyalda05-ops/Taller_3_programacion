package patrones_ejercicio_2;

public class UsuarioFactory {
	// Factory Method: Centraliza la lógica de creación.
    public static Usuario crearUsuario(String tipo, String nombre) {
        if (tipo.equalsIgnoreCase("normal")) {
            // El usuario base también puede ser un Producto Concreto
            return new Usuario(nombre);
        } else if (tipo.equalsIgnoreCase("admin")) {
            return new UsuarioAdmin(nombre);
        } else if (tipo.equalsIgnoreCase("invitado")) {
            return new UsuarioInvitado(nombre);
        }
        // Devuelve null o lanza una excepción si el tipo no es reconocido.
        return null;
    }
}
