package com.qintess.hibernate.generics.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.qintess.hibernate.generics.base.EntBase;



@Entity // anotação para mapear a tabela do banco de dados através da classe 
@Table(name="fornecedor_has_produto")
public class FornecedorHasProduto implements EntBase{
	
	@Id //mapeando campo Id na tabela
	@GeneratedValue(strategy = GenerationType.IDENTITY)//mapeando a chave primária real para a tabela
	@Column(name="id") //mapeando a coluna e especificando o campo
	private Long id;
	
	@ManyToOne
	private  Produto produto; //declarando uma lista

	@ManyToOne
	private  Fornecedor fornecedor; //declarando uma lista
	
	@Column(name="estoque") //mapeando a coluna e especificando o campo
	private int estoque;
	
	@Column(name="preco_custo") //mapeando a coluna e especificando o campo
	private double preco_custo;
	
	
	
	public FornecedorHasProduto() {
		
	}

	
	
	
	

	public FornecedorHasProduto(Produto produto, Fornecedor fornecedor, int estoque, double preco_custo) {
		this.produto = produto;
		this.fornecedor = fornecedor;
		this.estoque = estoque;
		this.preco_custo = preco_custo;
	}






	public Produto getProduto() {
		return produto;
	}






	public void setProduto(Produto produto) {
		this.produto = produto;
	}






	public Fornecedor getFornecedor() {
		return fornecedor;
	}






	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}






	public int getEstoque() {
		return estoque;
	}






	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}






	public double getPreco_custo() {
		return preco_custo;
	}






	public void setPreco_custo(double preco_custo) {
		this.preco_custo = preco_custo;
	}






	public void setId(Long id) {
		this.id = id;
	}






	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}

}
