package classes;

public class Caminhao extends Veiculos {
    private String tipoCaminhao;

    public Caminhao(String placa, String tipoCombustivel, String fabricante, String numeroChassi, String cor, String tipo, String modelo, String anoFabricacao, String anoModelo, String tipoCaminhao) {
        super(placa, tipoCombustivel, fabricante, numeroChassi, cor, tipo, modelo, anoFabricacao, anoModelo);
        this.tipoCaminhao = tipoCaminhao;
    }

    public String getTipoCaminhao() {
        return tipoCaminhao;
    }
}
