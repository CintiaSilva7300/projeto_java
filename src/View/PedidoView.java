package View;

import model.Pedido;
import model.Produto;

public class PedidoView {
	
	public void mostrarDetalhesPedido(Pedido pedido) {
        System.out.println("Detalhes do Pedido:");
        System.out.println("Cliente: " + pedido.getCliente().getNome());
        System.out.println("Itens do Pedido:");

        if (pedido.getItens() != null) {
            for (Produto produto : pedido.getItens()) {
                System.out.println(" - " + produto.getNome() + ": R$" + produto.getPreco());
            }
        } else {
            System.out.println(" - Nenhum item no pedido.");
        }

        System.out.println("Data do Pedido: " + pedido.getDataPedido());
    }
}
