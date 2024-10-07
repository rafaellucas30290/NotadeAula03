
class Gato extends Animal {
    public Gato(String nome, String raca) {
        super(nome, raca);
    }

    // Método que faz o gato miar
    public void mia() {
        System.out.println(getNome() + " está miando: Miau!");
    }
}
