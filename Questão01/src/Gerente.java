class Gerente extends Funcionario {
    private String projeto;

    public Gerente(String nome, String nasc, double salario, String projeto) {
        super(nome, nasc, salario);
        this.projeto = projeto;
    }

    public void informarProjeto() {
        System.out.printf("Gerente %s está gerenciando o projeto: %s%n", nome, projeto);
    }
}