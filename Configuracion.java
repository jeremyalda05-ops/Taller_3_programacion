package patrones_ejercicio_1;

public class Configuracion {
	// 1. Instancia estática y privada de la propia clase. Se inicializa a null
    // y se inicializa de forma lazy (cuando se solicita por primera vez).
    private static Configuracion instancia = null;

    private String configValor = "Valor por defecto";

    // 2. Constructor privado para evitar la instanciación externa.
    private Configuracion() {
        // Inicialización aquí
    }

    // 3. Método estático y público para obtener la única instancia.
    // Utiliza 'double-checked locking' para ser thread-safe de forma eficiente.
    public static Configuracion getInstancia() {
        if (instancia == null) {
            // Sincronización para asegurar la seguridad en entornos multi-hilo
            synchronized (Configuracion.class) {
                if (instancia == null) {
                    instancia = new Configuracion();
                }
            }
        }
        return instancia;
    }

    public String getConfigValor() {
        return configValor;
    }

    public void setConfigValor(String valor) {
        this.configValor = valor;
    }
}
