package com.qintess.hibernate.generics.model;

import com.qintess.hibernate.generics.base.EntBase;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;




@Entity // anotação para mapear a tabela do banco de dados através da classe 
@Table (name="vendaItens") //definindo nome da tabela que está sendo mapeada
public class VendaItens implements EntBase {

	@Id //mapeando o campo id
	@GeneratedValue(strategy = GenerationType.IDENTITY)// definindo como auto-incremento
	@Column(name="id")//definindo a coluna como id
	private Long id;
	
	@ManyToOne
	private Produto produto;
	
	@ManyToOne
	private Venda venda;
	
	@Column(name="quantidade")//definindo a coluna como quatidade
	private int quantidade;
	
	@Column(name="preco_custo")//definindo a coluna como preco_custo
	private double preco_custo;
	
	@Column(name="preco_uni")//definindo a coluna como preco_uni
	private double preco_uni;
	
	
	public VendaItens() { //construtor sem argumentos
		
	}
	
	
	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Venda getVenda() {
		return venda;
	}

	public void setVenda(Venda venda) {
		this.venda = venda;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
		this.preco_custo  = this.quantidade * this.getPreco_uni();
	}

	public double getPreco_custo() {
		return preco_custo;
	}

	public void setPreco_custo(double preco_custo) {
		this.preco_custo = preco_custo;
	}

	public double getPreco_uni() {
		return preco_uni;
	}

	public void setPreco_uni(double preco_uni) {
		this.preco_uni = preco_uni;
	}

	public void setId(Long id) {
		this.id = id;
	}




	@Override
	public String toString() {//
		return "VendaItens [id=" + id + ", produto=" + produto + ", venda=" + venda + ", quantidade=" + quantidade
				+ ", preco_custo=" + preco_custo + ", preco_uni=" + preco_uni + "]";
	}


	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}

}
