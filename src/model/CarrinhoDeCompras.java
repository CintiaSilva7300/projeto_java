package model;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	private List<Produto> itens;

    public CarrinhoDeCompras(List<Produto> itens) {
        this.itens = itens != null ? new ArrayList<>(itens) : new ArrayList<>();
    }

    public List<Produto> getItens() {
        return itens;
    }

	public void adicionarItem(Produto arroz) {
		// TODO Auto-generated method stub
		
	}
	
}
