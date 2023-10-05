package telas;

import paineis.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaPrincipal extends JFrame {
    private JMenuBar jmbBarra;
    private JMenu jmMenu,jmCaminhao;
    private JMenuItem jmiCarro,jmiOnibus,jmiCarreta,jmiBau,jmiBasculante;

    public TelaPrincipal(String tela) throws HeadlessException {
    setSize(900,500);
    setUndecorated(true);
    setLocationRelativeTo(getContentPane());
    Color minhaCorzinha = new Color(235, 207, 178);
    getContentPane().setBackground(minhaCorzinha);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    iniciarComponentes();
    criarEventos();

    }

    private void iniciarComponentes() {
        //BARRA DOS ITENS
        jmbBarra = new JMenuBar();
        jmMenu = new JMenu("Cadastro");
        setJMenuBar(jmbBarra);
        jmbBarra.add(jmMenu);
        //
        jmiCarro = new JMenuItem("Carro");
        jmiCarreta = new JMenuItem("Carreta");
        jmiOnibus = new JMenuItem("Onibus");
        jmiBasculante = new JMenuItem("Basculante");

        jmiBau = new JMenuItem("Bau");
        jmiCarreta = new JMenuItem("Carreta");
        //
        jmCaminhao = new JMenu("Caminhao");
        jmMenu.add(jmCaminhao);
        jmCaminhao.add(jmiBasculante);
        jmCaminhao.add(jmiBau);
        jmCaminhao.add(jmiCarreta);

        jmMenu.add(jmiOnibus);
        jmMenu.add(jmiCarro);
    }

    private void criarEventos() {
        jmiCarro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PainelCarro carrinho = new PainelCarro();
                getContentPane().removeAll();//remove todos os componentes da tela
                getContentPane().add(carrinho);//adicionando o painel
                getContentPane().validate();//validação dos componentes
            }
        });

        jmiOnibus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PainelOnibus onibuszinho = new PainelOnibus();
                getContentPane().removeAll();//remove todos os componentes da tela
                getContentPane().add(onibuszinho);//adicionando o painel
                getContentPane().validate();//validação dos componentes
            }
        });
        jmiCarreta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PainelCarreta carretinha = new PainelCarreta();
                getContentPane().removeAll();//remove todos os componentes da tela
                getContentPane().add(carretinha);//adicionando o painel
                getContentPane().validate();//validação dos componentes
            }
        });
        jmiBau.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PainelBau bauzito = new PainelBau();
                getContentPane().removeAll();//remove todos os componentes da tela
                getContentPane().add(bauzito);//adicionando o painel
                getContentPane().validate();//validação dos componentes
            }
        });
        jmiBasculante.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PainelBasculante basculantinho = new PainelBasculante();
                getContentPane().removeAll();//remove todos os componentes da tela
                getContentPane().add(basculantinho);//adicionando o painel
                getContentPane().validate();//validação dos componentes
            }
        });
    }
}
