package classes;

public class Onibus extends Veiculos {
    private int numeroPoltronas;

    public Onibus(String placa, String tipoCombustivel, String fabricante, String numeroChassi, String cor, String tipo, String modelo, String anoFabricacao, String anoModelo, int numeroPoltronas) {
        super(placa, tipoCombustivel, fabricante, numeroChassi, cor, tipo, modelo, anoFabricacao, anoModelo);
        this.numeroPoltronas = numeroPoltronas;
    }

    public int getNumeroPoltronas() {
        return numeroPoltronas;
    }
}
