package classes;

public class Carros extends Veiculos{
    private int numeroLugares;

    public Carros(String placa, String tipoCombustivel, String fabricante, String numeroChassi, String cor, String tipo, String modelo, String anoFabricacao, String anoModelo, int numeroLugares) {
        super(placa, tipoCombustivel, fabricante, numeroChassi, cor, tipo, modelo, anoFabricacao, anoModelo);
        this.numeroLugares = numeroLugares;
    }

    public int getNumeroLugares() {
        return numeroLugares;
    }
}
