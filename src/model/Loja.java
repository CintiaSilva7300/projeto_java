package model;

import java.util.List;

public class Loja {
	private List<Produto> estoque;
    private List<Pedido> pedidos;
	
    public void adicionarProduto(Produto arroz) {
		// TODO Auto-generated method stub
		
	}

	public List<Produto> getEstoque() {
		return estoque;
	}

	public void setEstoque(List<Produto> estoque) {
		this.estoque = estoque;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

}
