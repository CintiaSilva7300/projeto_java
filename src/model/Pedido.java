package model;

import java.util.Date;
import java.util.List;

public class Pedido {
	 
	private Cliente cliente;
    private List<Produto> itens;
    private Date dataPedido;
	
    public Pedido() {
		super();
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Produto> getItens() {
		return itens;
	}

	public void setItens(List<Produto> itens) {
		this.itens = itens;
	}

	public Date getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}
    
    
}
