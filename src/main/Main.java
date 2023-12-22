package main;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import Controllers.CarrinhoController;
import Controllers.PedidoController;
import View.CarrinhoView;
import View.PedidoView;
import model.CarrinhoDeCompras;
import model.Cliente;
import model.Loja;
import model.Pedido;
import model.Produto;

public class Main {
	
	private static List<Produto> itens;

	public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o nome do produto:");
        String nomeProduto = ler.nextLine();

        System.out.println("Digite o preço do produto:");
        float precoProduto = ler.nextFloat();
        ler.nextLine(); 

        Produto produto = new Produto(nomeProduto, precoProduto);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras(itens);
        carrinho.adicionarItem(produto);

        Loja loja = new Loja();
        loja.adicionarProduto(produto);

        System.out.println("Digite o nome do cliente:");
        String nomeCliente = ler.nextLine();

        System.out.println("Digite o e-mail do cliente:");
        String emailCliente = ler.nextLine();

        Cliente cliente = new Cliente(nomeCliente, emailCliente);

        // Cria pedido
        Pedido pedido = new Pedido(cliente, carrinho.getItens(), new Date());

        // Controllers e Views
        CarrinhoView carrinhoView = new CarrinhoView();
        CarrinhoController carrinhoController = new CarrinhoController(carrinho, carrinhoView);

        PedidoView pedidoView = new PedidoView();
        PedidoController pedidoController = new PedidoController(pedido, pedidoView);

        // Atualiza views
        carrinhoController.atualizarView();
        pedidoController.atualizarView();
    }
	
}
