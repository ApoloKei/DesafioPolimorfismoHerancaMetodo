package paineis;

import javax.swing.*;

public class PainelBasculante extends javax.swing.JPanel{

    private JLabel jlPlaca,jlCombustivel,jlFabricante,jlChassi,jlCor,jlTipo,jlModelo,jlanoFabricacao,jlModeloAno;
    private JTextField jtPlaca,jtCombustivel,jtFabricante,jtChassi,jtCor,jtTipo,jtModelo,jtanoFabricacao,jtModeloAno;
    private JComboBox jcbCaixinha;
    private JCheckBox jcbCheck;
    private JButton jbCadastrar;

    public PainelBasculante() {
        setSize(900,500);
        setLayout(null);

        iniciarComponentes();
        criarEventos();


    }

    private void iniciarComponentes() {
        //JCOMBOBOX
        String[] tipos = {"25","32","42"};
        jcbCaixinha = new JComboBox(tipos);
        add(jcbCaixinha);
        jcbCaixinha.setBounds(650,40,150,30);
        jlTipo = new JLabel("Quantidade de Lugares"); add(jlTipo);
        jlTipo.setBounds(650,20,150,20);

        //BOTAO
        jbCadastrar = new JButton("Cadastrar"); add(jbCadastrar);
        jbCadastrar.setBounds(650,420,130,30);



        jlPlaca = new JLabel("Placa"); add(jlPlaca);
        jlPlaca.setBounds(450,20,150,20);
        jtPlaca = new JTextField(); add(jtPlaca);
        jtPlaca.setBounds(450,40,100,30);

        jlCombustivel = new JLabel("Tipo do Combustivel"); add(jlCombustivel);
        jlCombustivel.setBounds(450,70,150,20);
        jtCombustivel = new JTextField(); add(jtCombustivel);
        jtCombustivel.setBounds(450,100,100,30);

        jlanoFabricacao = new JLabel("Ano da Fabricação"); add(jlanoFabricacao);
        jlanoFabricacao.setBounds(450,130,150,20);
        jtanoFabricacao = new JTextField(); add(jtanoFabricacao);
        jtanoFabricacao.setBounds(450,150,150,30);

        jlChassi = new JLabel("Número do Chassi"); add(jlChassi);
        jlChassi.setBounds(450,180,150,20);
        jtChassi = new JTextField(); add(jtChassi);
        jtChassi.setBounds(450,210,150,30);

        jlCor = new JLabel("Cor do Carro"); add(jlCor);
        jlCor.setBounds(450,240,150,20);
        jtCor = new JTextField(); add(jtCor);
        jtCor.setBounds(450,270,150,30);

        jlFabricante = new JLabel("Fabricante do Carro"); add(jlFabricante);
        jlFabricante.setBounds(450,300,150,20);
        jtFabricante = new JTextField(); add(jtFabricante);
        jtFabricante.setBounds(450,330,150,30);

        jlModelo = new JLabel("Modelo do Carro"); add(jlModelo);
        jlModelo.setBounds(450,360,150,20);
        jtModelo = new JTextField(); add(jtModelo);
        jtModelo.setBounds(450,390,150,30);

        jlModeloAno = new JLabel("Ano do modelo do Carro"); add(jlModeloAno);
        jlModeloAno.setBounds(650,70,150,20);
        jtModeloAno = new JTextField(); add(jtModeloAno);
        jtModeloAno.setBounds(650,100,150,30);

        /*
        jtTipo = new JTextField(); add(jtTipo);
        jtTipo.setBounds(450,360,150,30);
*/
    }

    private void criarEventos() {


    }
}
