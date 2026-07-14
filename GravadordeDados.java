package modelo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Classe responsável por gravar e recuperar objetos
 * utilizando serialização.
 *
 * Os métodos desta classe lançam IOException,
 * conforme exigido na especificação do projeto.
 *
 * @author Seu Nome
 * @version 1.0
 */
public class GravadorDeDados {

    /**
     * Salva um objeto em um arquivo.
     *
     * @param objeto Objeto que será gravado.
     * @param nomeArquivo Nome do arquivo.
     * @throws IOException Caso ocorra erro durante a gravação.
     */
    public void salvar(Object objeto, String nomeArquivo) throws IOException {

        try (ObjectOutputStream out =
                new ObjectOutputStream(new FileOutputStream(nomeArquivo))) {

            out.writeObject(objeto);
            out.flush();
        }
    }

    /**
     * Recupera um objeto previamente gravado.
     *
     * @param nomeArquivo Nome do arquivo.
     * @