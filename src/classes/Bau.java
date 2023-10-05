package classes;

public class Bau extends Caminhao{
    private String tipoBau;

    public Bau(String placa, String tipoCombustivel, String fabricante, String numeroChassi, String cor, String tipo, String modelo, String anoFabricacao, String anoModelo, String tipoCaminhao, String tipoBau) {
        super(placa, tipoCombustivel, fabricante, numeroChassi, cor, tipo, modelo, anoFabricacao, anoModelo, tipoCaminhao);
        this.tipoBau = tipoBau;
    }

    public String getTipoBau() {
        return tipoBau;
    }
}
