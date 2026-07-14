package modelo;

import java.io.Serializable;
import java.util.Objects;

/**
 * Classe que representa um Aluno do sistema.
 *
 * Os objetos desta classe podem ser gravados em arquivo
 * através da serialização.
 *
 * @author Seu Nome
 * @version 1.0
 */
public class Aluno implements Serializable {

    private static final long serialVersionUID = 1L;

    private String matricula;
    private String nome;
    private String curso;
    private int idade;

    /**
     * Construtor da classe.
     *
     * @param matricula Matrícula do aluno
     * @param nome Nome do aluno
     * @param curso Curso do aluno
     * @param idade Idade do aluno
     */
    public Aluno(String matricula, String nome, String curso, int idade) {
        this.matricula = matricula;
        this.nome = nome;
        this.curso = curso;
        this.idade = idade;
    }

    /**
     * Retorna a matrícula do aluno.
     *
     * @return matrícula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Define a matrícula do aluno.
     *
     * @param matricula Nova matrícula
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * Retorna o nome do aluno.
     *
     * @return nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do aluno.
     *
     * @param nome Novo nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Retorna o curso do aluno.
     *
     * @return curso
     */
    public String getCurso() {
        return curso;
    }

    /**
     * Define o curso do aluno.
     *
     * @param curso Novo curso
     */
    public void setCurso(String curso) {
        this.curso = curso;
    }

    /**
     * Retorna a idade do aluno.
     *
     * @return idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * Define a idade do aluno.
     *
     * @param idade Nova idade
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * Compara dois alunos pela matrícula.
     */
    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        Aluno aluno = (Aluno) obj;

        return Objects.equals(matricula, aluno.matricula);
    }

    /**
     * Gera o hashCode baseado na matrícula.
     */
    @Override
    public int hashCode() {
        return Objects.hash(matricula);
    }

    /**
     * Retorna uma representação textual do aluno.
     */
    @Override
    public String toString() {
        return "Aluno{" +
                "matricula='" + matricula + '\'' +
                ", nome='" + nome + '\'' +
                ", curso='" + curso + '\'' +
                ", idade=" + idade +
                '}';
    }

}