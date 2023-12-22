package View;

import model.CarrinhoDeCompras;
import model.Produto;

public class CarrinhoView {
	 public void mostrarItensCarrinho(CarrinhoDeCompras carrinho) {
	        System.out.println("Itens do Carrinho:");

	        // Verifica se a lista de itens não é nula antes de fazer o for
	        if (carrinho.getItens() != null) {
	            for (Produto produto : carrinho.getItens()) {
	                System.out.println(" - " + produto.getNome() + ": R$" + produto.getPreco());
	            }
	        } else {
	            System.out.println(" - Nenhum item no carrinho.");
	        }
	    }
}
