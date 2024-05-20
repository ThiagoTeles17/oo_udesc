package domain;

public class Veiculo {

    private int ano;
    private String cor;
    private String modelo;
    private int quilometragem;


    public Veiculo(){

    }

    public Veiculo(int ano, String modelo, String cor, int quilometragem){

        this.ano = ano;
        this.cor = cor;
        this.modelo = modelo;
        this.quilometragem = quilometragem;

    }
    public void exibirModelo(){
        System.out.println(modelo);
    }
    public void verificarManutencao(){
        if(quilometragem < 25_000){
            System.out.println("Verificando manutenção...\nTudo OK");
        }
        else if(quilometragem > 25_000 && quilometragem < 75_000){
            System.out.println("Verificando manutenção...\nRealizar revisão parcial");
        }
        else{
            System.out.println("Verificando manutenção...\nRealizar revisão completa");
        }

    }

    public void exibirCor(){
        System.out.println("Cor: " + cor);
    }
    public void mudarCor(String cor){
        System.out.println("Alterando cor...");
        this.cor = cor;

    }




}
