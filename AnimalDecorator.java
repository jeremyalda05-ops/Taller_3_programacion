package patrones_ejercicio_4;

public abstract class AnimalDecorator extends Animal {
	protected Animal animal; // Referencia al objeto envuelto

    public AnimalDecorator(Animal animal) {
        super(animal.getTipo());
        this.animal = animal;
    }

    @Override
    public void EmitirSonido() {
        this.animal.EmitirSonido(); // Llama al método del objeto envuelto
    }

}
