package patrones_ejercicio_3;

public class Adaptador implements InterfazObjetivo {
	// Mantiene una referencia a la clase que necesita ser adaptada (Adaptee)
    private LibreriaExterna externa;

    public Adaptador() {
        this.externa = new LibreriaExterna();
    }

    // Implementa el método que espera el cliente
    @Override
    public void funcionAdaptada() {
        // Traduce la llamada a la interfaz de la librería externa.
        System.out.println("Adaptador: Traducción de la llamada...");
        externa.metodoExterno();
    }

}
