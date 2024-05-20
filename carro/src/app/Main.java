package app;

import domain.Veiculo;

public class Main {

    public static void main(String[] args){

        Veiculo veiculo = new Veiculo(1975, "Chevette Tubarão", "Rosa Shock", 350_000);

        veiculo.exibirModelo();
        veiculo.verificarManutencao();
        veiculo.exibirCor();
        veiculo.mudarCor("Preto");
        veiculo.exibirCor();

    }
}