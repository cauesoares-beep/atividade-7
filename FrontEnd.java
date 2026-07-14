package gui;

import controller.SistemaController;
import modelo.Aluno;

import javax.swing.*;
import java.awt.*;
import java.util.Collection;

/**
 * Tela principal do sistema.
 *
 * Implementada utilizando Swing.
 *
 * Possui menu para:
 * - Cadastrar
 * - Pesquisar
 * - Apagar
 * - Salvar
 * - Listar
 *
 * @author Seu Nome
 * @version 1.0
 */
public class FrontEnd extends JFrame {

    private SistemaController controller;

    private JMenuBar barraMenu;

    private JMenu menuAluno;

    private JMenuItem itemCadastrar;
    private JMenuItem itemPesquisar;
    private JMenuItem itemApagar;
    private JMenuItem itemSalvar;
    private JMenuItem itemSair;

    private JButton botaoListar;

    private JTextArea areaTexto;

    /**
     * Construtor.
     */
    public FrontEnd() {

        controller = new SistemaController();

        inicializarComponentes();

        setTitle("Sistema de Cadastro de Alunos");

        setSize(700,500);

        setLocationRelativeTo(null);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);

    }

    /**
     * Cria todos os componentes da tela.
     */
    private void inicializarComponentes() {

        barraMenu = new JMenuBar();

        menuAluno = new JMenu("Sistema");

        itemCadastrar = new JMenuItem("Cadastrar Aluno");

        itemPesquisar = new JMenuItem("Pesquisar Aluno");

        itemApagar = new JMenuItem("Apagar Aluno");

        itemSalvar = new JMenuItem("Salvar Dados");

        itemSair = new JMenuItem("Sair");

        menuAluno.add(itemCadastrar);

        menuAluno.add(itemPesquisar);

        menuAluno.add(itemApagar);

        menuAluno.addSeparator();

        menuAluno.add(itemSalvar);

        menuAluno.addSeparator();

        menuAluno.add(itemSair);

        barraMenu.add(menuAluno);

        setJMenuBar(barraMenu);

        areaTexto = new JTextArea();

        areaTexto.setEditable(false);

        JScrollPane scroll = new JScrollPane(areaTexto);

        botaoListar = new JButton("Listar Todos os Alunos");

        JPanel painel = new JPanel(new BorderLayout());

        painel.add(botaoListar, BorderLayout.NORTH);

        painel.add(scroll, BorderLayout.CENTER);

        add(painel);

                // ===== EVENTO CADASTRAR =====

        itemCadastrar.addActionListener(e -> {

            String matricula = JOptionPane.showInputDialog(
                    this,
                    "Digite a matrícula:");

            if (matricula == null || matricula.isBlank())
                return;

            String nome = JOptionPane.showInputDialog(
                    this,
                    "Digite o nome:");

            if (nome == null || nome.isBlank())
                return;

            String curso = JOptionPane.showInputDialog(
                    this,
                    "Digite o curso:");

            if (curso == null || curso.isBlank())
                return;

            String idadeTexto = JOptionPane.showInputDialog(
                    this,
                    "Digite a idade:");

            try {

                int idade = Integer.parseInt(idadeTexto);

                controller.cadastrarAluno(
                        matricula,
                        nome,
                        curso,
                        idade);

                JOptionPane.showMessageDialog(
                        this,
                        "Aluno cadastrado com sucesso!");

            } catch (NumberFormatException ex) {

                JOptionPane.showMessageDialog(
                        this,
                        "Idade inválida.");

            }

        });

        // ===== EVENTO PESQUISAR =====

        itemPesquisar.addActionListener(e -> {

            String matricula = JOptionPane.showInputDialog(
                    this,
                    "Informe a matrícula:");

            if (matricula == null)
                return;

            Aluno aluno = controller.pesquisarAluno(matricula);

            if (aluno == null) {

                JOptionPane.showMessageDialog(
                        this,
                        "Aluno não encontrado.");

            } else {

                JOptionPane.showMessageDialog(
                        this,
                        aluno.toString());

            }

        });

        // ===== EVENTO APAGAR =====

        itemApagar.addActionListener(e -> {

            String matricula = JOptionPane.showInputDialog(
                    this,
                    "Informe a matrícula:");

            if (matricula == null)
                return;

            boolean removeu = controller.removerAluno(matricula);

            if (removeu) {

                JOptionPane.showMessageDialog(
                        this,
                        "Aluno removido.");

            } else {

                JOptionPane.showMessageDialog(
                        this,
                        "Aluno não encontrado.");

            }

        });

        // ===== EVENTO SALVAR =====

        itemSalvar.addActionListener(e -> {

            try {

                controller.salvarDados();

                JOptionPane.showMessageDialog(
                        this,
                        "Dados salvos com sucesso!");

            } catch (Exception ex) {

                JOptionPane.showMessageDialog(
                        this,
                        "Erro ao salvar os dados.");

            }

        });

        // ===== EVENTO LISTAR =====

        botaoListar.addActionListener(e -> {

            Collection<Aluno> alunos =
                    controller.listarAlunos();

            areaTexto.setText("");

            if (alunos.isEmpty()) {

                areaTexto.append("Nenhum aluno cadastrado.");

            } else {

                for (Aluno aluno : alunos) {

                    areaTexto.append(aluno.toString());

                    areaTexto.append("\n");

                    areaTexto.append("---------------------------------\n");

                }

            }

        });

        // ===== EVENTO SAIR =====

        itemSair.addActionListener(e -> {

            int opcao = JOptionPane.showConfirmDialog(
                    this,
                    "Deseja realmente sair?",
                    "Confirmação",
                    JOptionPane.YES_NO_OPTION);

            if (opcao == JOptionPane.YES_OPTION) {

                dispose();

            }

        });

    }

}