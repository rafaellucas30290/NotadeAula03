
public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Edson Arantes do Nascimento", "Labrador");
        Gato gato = new Gato("Galactus, o Devorador de Mundos", "Siamês");

        // Usando os métodos
        cachorro.caminha();
        cachorro.late();

        gato.caminha();
        gato.mia();
    }
}