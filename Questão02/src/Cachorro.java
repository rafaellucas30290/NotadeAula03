
class Cachorro extends Animal {
    public Cachorro(String nome, String raca) {
        super(nome, raca);
    }

    // Método que faz o cachorro latir
    public void late() {
        System.out.println(getNome() + " está latindo: Au Au!");
    }
}