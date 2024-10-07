class Funcionario {
    protected String nome;
    protected String nasc; 
    protected double salario;

    public Funcionario(String nome, String nasc, double salario) {
        this.nome = nome;
        this.nasc = nasc;
        this.salario = salario;
    }

    public void informarSalario() {
        System.out.printf("Salário de %s: R$ %.2f%n", nome, salario);
    }

    public double calcularIdade(int anoAtual) {
        String[] partesData = nasc.split("/");
        int anoNascimento = Integer.parseInt(partesData[2]); 
        return anoAtual - anoNascimento;
    }
}



