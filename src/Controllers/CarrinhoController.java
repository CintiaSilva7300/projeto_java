package Controllers;

import View.CarrinhoView;
import model.CarrinhoDeCompras;

public class CarrinhoController {
	private CarrinhoDeCompras carrinho;
    private CarrinhoView carrinhoView;

    public CarrinhoController(CarrinhoDeCompras carrinho, CarrinhoView carrinhoView) {
        this.carrinho = carrinho;
        this.carrinhoView = carrinhoView;
    }

	public void atualizarView() {
		carrinhoView.mostrarItensCarrinho(carrinho);
	}


}
