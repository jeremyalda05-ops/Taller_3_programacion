package patrones_ejercicio_3;

public class LibreriaExterna {
	public void metodoExterno() {
        System.out.println("Funcionalidad externa sin modificar.");
    }
}

// Interfaz que el cliente esperaría (Target)
interface InterfazObjetivo {
    void funcionAdaptada();
}


