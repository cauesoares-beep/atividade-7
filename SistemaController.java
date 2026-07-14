package controller;

import java.io.IOException;
import java.util.Collection;

import modelo.Aluno;
import modelo.Sistema;
import modelo.SistemaMap;

/**
 * Controller responsável por intermediar a comunicação
 * entre a interface gráfica e a lógica do sistema.
 *
 * @author Seu Nome
 * @version 1.0
 */
public class SistemaController {

    /**
     * Instância da classe que implementa a interface Sistema.
     */
    private Sistema sistema;

    /**
     * Construtor da classe.
     */
    public SistemaController() {
        sistema = new SistemaMap();
    }

    /**
     * Cadastra um aluno.
     *
     * @param matricula Matrícula do aluno.
     * @param nome Nome do aluno.
     * @param curso Curso do aluno.
     * @param idade Idade do aluno.
     */
    public void cadastrarAluno(String matricula,
                               String nome,
                               String curso,
                               int idade) {

        Aluno aluno = new Aluno(matricula, nome, curso, idade);
        sistema.cadastrarAluno(aluno);
    }

    /**
     * Pesquisa um aluno pela matrícula.
     *
     * @param matricula Matrícula do aluno.
     * @return Aluno encontrado ou null.
     */
    public Aluno pesquisarAluno(String matricula) {
        return sistema.pesquisarAluno(matricula);
    }

    /**
     * Remove um aluno.
     *
     * @param matricula Matrícula.
     * @return true caso o aluno seja removido.
     */
    public boolean removerAluno(String matricula) {
        return sistema.removerAluno(matricula);
    }

    /**
     * Retorna todos os alunos cadastrados.
     *
     * @return coleção de alunos.
     */
    public Collection<Aluno> listarAlunos() {
        return sistema.listarAlunos();
    }

    /**
     * Salva os dados do sistema.
     *
     * @throws IOException Caso ocorra erro.
     */
    public void salvarDados() throws IOException {
        sistema.salvarDados();
    }

    /**
     * Recupera os dados gravados.
     *
     * @throws IOException Caso ocorra erro de leitura.
     * @throws ClassNotFoundException Caso o arquivo esteja inválido.
     */
    public void recuperarDados()
            throws IOException, ClassNotFoundException {

        sistema.recuperarDados();
    }

}