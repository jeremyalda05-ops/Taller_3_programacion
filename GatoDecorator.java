package patrones_ejercicio_4;

public class GatoDecorator extends AnimalDecorator {
	public GatoDecorator(Animal animal) {
        super(animal);
    }

    @Override
    public void EmitirSonido() {
        animal.EmitirSonido();
        maullar();
        ronronear();
    }

    private void maullar() {
        System.out.println("¡Miau! (Comportamiento de Gato: Maullido)");
    }

    private void ronronear() {
        System.out.println("¡Ronronea! (Comportamiento de Gato: Contento)");
    }

}
