public class Carro extends Veiculo{

    int numeroDePortas;

    public Carro(int numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }

    public Carro(String marca, String modelo, int ano, int numeroDePortas) {
        super(marca, modelo, ano);
        this.numeroDePortas = numeroDePortas;
    }

    public double calcularCustoManutencao() {
        return 500.00;
    }

    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Número de Portas: " + numeroDePortas);
    }
}
