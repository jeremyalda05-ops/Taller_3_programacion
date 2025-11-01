package patrones_ejercicio_4;

public class PerroDecorator extends AnimalDecorator {
	public PerroDecorator(Animal animal) {
        super(animal);
    }

    @Override
    public void EmitirSonido() {
        animal.EmitirSonido();
        ladrar();
        moverCola();
    }

    private void ladrar() {
        System.out.println("¡Guau guau! (Comportamiento de Perro: Ladrido)");
    }

    private void moverCola() {
        System.out.println("¡Mueve la cola! (Comportamiento de Perro: Alegría)");
    }

}
