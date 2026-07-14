package gui;

import javax.swing.SwingUtilities;

/**
 * Classe principal do sistema.
 *
 * Responsável por iniciar a interface gráfica.
 *
 * @author Seu Nome
 * @version 1.0
 */
public class Main {

    /**
     * Método principal da aplicação.
     *
     * @param args argumentos da linha de comando.
     */
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {

                new FrontEnd();

            }

        });

    }

}