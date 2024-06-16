import java.util.ArrayList;
import java.util.List;

public class GerenciamentoVeiculos {
    public static void main(String[] args) {

        List<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(new Carro("Fiat", "Cronos", 2020, 4));
        veiculos.add(new Moto("Honda", "CBX 250", 2017, 250));
        veiculos.add(new Carro("Chevrolet", "Onix", 2019, 2019));
        veiculos.add(new Moto("Yamaha", "Fazer 160", 2022, 160));

        for (Veiculo veiculo : veiculos){
            veiculo.exibirDetalhes();
            System.out.println("O curso de manutenção é: " + veiculo.calcularCustoManutencao());
            System.out.println("################################");
        }


    }
}