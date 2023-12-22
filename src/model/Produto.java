package model;

public class Produto {
	private String nome;
    private float preco;
	
	public Produto(String nome, float preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(float preco) {
		this.preco = preco;
	}
    
    
}
