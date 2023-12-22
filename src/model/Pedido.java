package model;

import java.util.Date;
import java.util.List;

public class Pedido {
	 
	private Cliente cliente;
    private List<Produto> itens;
    private Date dataPedido;

    public Pedido(Cliente cliente, List<Produto> itens, Date dataPedido) {
        this.cliente = cliente;
        this.itens = itens != null ? itens : List.of();
        this.dataPedido = dataPedido;
    }

    public List<Produto> getItens() {
        return itens;
    }

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
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
