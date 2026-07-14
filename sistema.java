package modelo;

import java.io.IOException;
import java.util.Collection;

/**
 * Interface que define as principais operações do
 * Sistema de Cadastro de Alunos.
 *
 * A implementação desta interface deve utilizar um
 * Map para armazenar os alunos cadastrados.
 *
 * Também é responsável pela persistência dos dados
 * através de serialização de objetos.
 *
 * @author Seu Nome
 * @version 1.0
 */
public interface Sistema {

    /**
     * Cadastra um novo aluno.
     *
     * Caso já exista um aluno com a mesma matrícula,
     * seus dados serão atualizados.
     *
     * @param aluno Aluno a ser cadastrado.
     */
    void cadastrarAluno(Aluno aluno);

    /**
     * Pesquisa um aluno pela matrícula.
     *
     * @param matricula Matrícula do aluno.
     * @return Aluno encontrado ou null caso não exista.
     */
    Aluno pesquisarAluno(String matricula);

    /**
     * Remove um aluno do sistema.
     *
     * @param matricula Matrícula do aluno.
     * @return true caso o aluno tenha sido removido,
     * false caso não exista.
     */
    boolean removerAluno(String matricula);

    /**
     * Retorna todos os alunos cadastrados.
     *
     * @return Collection contendo todos os alunos.
     */
    Collection<Aluno> listarAlunos();

    /**
     * Salva todos os dados do sistema em arquivo.
     *
     * @throws IOException caso ocorra erro de gravação.
     */
    void salvarDados() throws IOException;

    /**
     * Recupera os dados gravados anteriormente.
     *
     * @throws IOException caso ocorra erro de leitura.
     * @throws ClassNotFoundException caso o arquivo esteja corrompido.
     */
    void recuperarDados() throws IOException, ClassNotFoundException;

}