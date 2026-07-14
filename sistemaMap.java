package modelo;

import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Implementação da interface Sistema utilizando
 * um HashMap para armazenar os alunos.
 *
 * A chave do mapa é a matrícula do aluno.
 *
 * Esta classe também é responsável pela
 * persistência dos dados utilizando a classe
 * GravadorDeDados.
 *
 * @author Seu Nome
 * @version 1.0
 */
public class SistemaMap implements Sistema {

    /**
     * Nome do arquivo onde os dados serão gravados.
     */
    private static final String ARQUIVO = "alunos.dat";

    /**
     * Estrutura responsável por armazenar os alunos.
     */
    private Map<String, Aluno> alunos;

    /**
     * Responsável pela gravação e recuperação dos dados.
     */
    private GravadorDeDados gravador;

    /**
     * Construtor da classe.
     */
    public SistemaMap() {

        alunos = new HashMap<>();