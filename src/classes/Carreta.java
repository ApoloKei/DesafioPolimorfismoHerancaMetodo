package classes;

public class Carreta extends Caminhao{
    private int numeroContainers;

    public Carreta(String placa, String tipoCombustivel, String fabricante, String numeroChassi, String cor, String tipo, String modelo, String anoFabricacao, String anoModelo, String tipoCaminhao, int numeroContainers) {
        super(placa, tipoCombustivel, fabricante, numeroChassi, cor, tipo, modelo, anoFabricacao, anoModelo, tipoCaminhao);
        this.numeroContainers = numeroContainers;
    }

    public int getNumeroContainers() {
        return numeroContainers;
    }
}
