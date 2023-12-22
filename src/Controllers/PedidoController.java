package Controllers;

import View.PedidoView;
import model.Pedido;

public class PedidoController {
	private Pedido pedido;
    private PedidoView pedidoView;

    public PedidoController(Pedido pedido, PedidoView pedidoView) {
        this.pedido = pedido;
        this.pedidoView = pedidoView;
    }

    public void atualizarView() {
        pedidoView.mostrarDetalhesPedido(pedido);
    }
}
