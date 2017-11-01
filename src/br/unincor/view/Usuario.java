package br.unincor.view;

import javax.swing.JOptionPane;

/**
 * Nesta classe você deve tratar exceção em todos os métodos que podem vir a
 * lançar exceções por entrada incorreta do usuário e remover os métodos não
 * utilizados.
 *
 */
public class Usuario {

    public void exibeMsg(String texto) {
        JOptionPane.showMessageDialog(null, texto, "MENSAGEM", JOptionPane.INFORMATION_MESSAGE);
    }

    public Integer exibeMenuPrincipal() {
        Object[] opcoes = {"Sanduiche", "Sobremesa", "Finalizar pedido"};
        Integer op = JOptionPane.showOptionDialog(null,
                "Escolha o produto",
                "Menu Principal",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                opcoes,
                2);

        return op;
    }

    public Integer exibeMenuPagamento() {
        Object[] opcoes = {"Dinheiro", "Cartão"};
        Integer op = JOptionPane.showOptionDialog(null,
                "Forma de Pagamento",
                "Pagamento",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                opcoes,
                0);

        return op;
    }
    
}
