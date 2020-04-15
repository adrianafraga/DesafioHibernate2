package com.qintess.hibernate.generics.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.qintess.hibernate.generics.base.EntBase;


@Entity // anotação para mapear a tabela do banco de dados através da classe 
@Table(name="produto")
public class Produto implements EntBase {

	@Id //mapeando o campo id
	@GeneratedValue(strategy = GenerationType.IDENTITY)// definindo como auto-incremento
	@Column(name="id")//definindo a coluna como id
	private Long id;
	
	@Column(name="preco_venda")//definindo a coluna como preco_venda
	private double preco_venda;
	
	@Column(name="min_estoque")//definindo a coluna como min_estoque
	private int min_estoque;
	
	@Column(name="nome")//definindo a coluna como nome
	private String nome;
	
	@Column(name="foto")//definindo a coluna como foto
	private String foto;
	
	
	
	
	public Produto() {
		
	}
	

	public double getPreco_venda() {
		return preco_venda;
	}

	public void setPreco_venda(double preco_venda) {
		this.preco_venda = preco_venda;
		
	}

	public int getMin_estoque() {
		return min_estoque;
	}

	public void setMin_estoque(int min_estoque) {
		this.min_estoque = min_estoque;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	
	@Override
	public String toString() {
		return "Produto [id=" + id + ", preco_venda=" + preco_venda + ", min_estoque=" + min_estoque + ", nome=" + nome
				+ ", foto=" + foto + "]";
	}


	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}

}
