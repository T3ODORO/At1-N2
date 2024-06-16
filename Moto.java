public class Moto extends Veiculo{

    int cilindradas;

    public Moto(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public Moto(String marca, String modelo, int ano, int cilindradas) {
        super(marca, modelo, ano);
        this.cilindradas = cilindradas;
    }

    public double calcularCustoManutencao() {
        return 300.00;
    }

    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Cilindradas: " + cilindradas);
    }

}
