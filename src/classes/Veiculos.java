package classes;

public class
Veiculos {
    protected String placa;
    protected String tipoCombustivel;
    protected String fabricante;
    protected String numeroChassi;
    protected String cor;
    protected String tipo;
    protected String modelo;
    protected String anoFabricacao;
    protected String anoModelo;

    public Veiculos(String placa, String tipoCombustivel, String fabricante, String numeroChassi, String cor, String tipo, String modelo, String anoFabricacao, String anoModelo) {
        this.placa = placa;
        this.tipoCombustivel = tipoCombustivel;
        this.fabricante = fabricante;
        this.numeroChassi = numeroChassi;
        this.cor = cor;
        this.tipo = tipo;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.anoModelo = anoModelo;
    }
    public String mostrarCadastro() {
        return "Placa: " + this.placa +
         "Tipo do combustivel: " + this.tipoCombustivel +
         "Fabricante: " + this.fabricante +
         "Numero do Chassi: " + this.numeroChassi +
         "Cor: " + this.cor +
         "tipo: " + this.tipo +
         "Modelo: " + this.modelo +
         "Ano de Fabricação: " + this.anoFabricacao +
         "Ano Modelo: " + this.anoModelo;
    }
}
