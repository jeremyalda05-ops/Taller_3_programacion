package patrones_ejercicio_4;

public class Animal {
	private String tipo = "genérico";

    public Animal() {}

    public Animal(String tipo) {
        this.tipo = tipo;
    }

    public void EmitirSonido() {
        System.out.println("Soy un " + tipo + ". Sonido genérico de animal.");
    }

    public String getTipo() {
        return tipo;
    }

}
